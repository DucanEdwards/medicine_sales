<template>
  <a-layout-header>
    <a-menu
        theme="dark"
        mode="horizontal"
        :style="{ lineHeight: '64px' }"
    >
      <a-menu-item key="/">
        <router-link to="/">首页</router-link>
      </a-menu-item>

      <a-menu-item key="/admin/opr" :style="opr.oprId?{}:{display:'none'}">
        <router-link to="/admin/opr">操作员</router-link>
      </a-menu-item>

      <a-menu-item key="/admin/saleorder" :style="opr.oprId?{}:{display:'none'}">
        <router-link to="/admin/saleorder">销售查询</router-link>
      </a-menu-item>

      <a-menu-item key="/admin/confirm-order" :style="opr.oprId?{}:{display:'none'}">
        <router-link to="/admin/confirm-order">操作订单</router-link>
      </a-menu-item>

      <a-menu-item key="/admin/supplier" :style="opr.oprId?{}:{display:'none'}">
        <router-link to="/admin/supplier">供货商</router-link>
      </a-menu-item>

      <a-menu-item key="/buy-medicine" :style="cust.custId?{}:{display:'none'}">
        <router-link to="/buy-medicine">购买药品</router-link>
      </a-menu-item>

      <a-menu-item key="/order-history" :style="cust.custId?{}:{display:'none'}">
        <router-link to="/order-history">历史订单</router-link>
      </a-menu-item>

      <a-menu-item key="/analysis">
        <router-link to="/analysis">数据统计</router-link>
      </a-menu-item>

      <a class="login" @click="showLoginModal" v-show="!opr.oprId && !cust.custId">
        <a-button type="primary">
          登录
        </a-button>
      </a>
      <a class="login" v-show="opr.oprId">
        <a-tag class="loginname">
          {{ opr.oprName }}
        </a-tag>
      </a>
      <a class="login" v-show="cust.custId">
        <a-tag class="loginname">
          {{ cust.custName }}
        </a-tag>
      </a>

      <a-avatar class="avatar" v-if="cust.custName || opr.oprName">
        {{ LoginFirstName(cust.custName) || LoginFirstName(opr.oprName) }}
      </a-avatar>

      <a-popconfirm
          title="Confirm Logout?"
          ok-text="Yes"
          cancel-text="No"
          @confirm="logout()"
      >
        <template #icon><QuestionCircleOutlined style="color: red" /></template>
        <a class="login" v-show="opr.oprId || cust.custId">
          <a-button type="primary">
            退出登录
          </a-button>
        </a>
      </a-popconfirm>
    </a-menu>

    <a-modal v-model:visible="visible" :confirmLoading="loading" title="Login" @ok="login">
      <a-radio-group v-model:value="radiovalue" @change="radiochange($event)">
        <a-radio :value="1">操作员</a-radio>
        <a-radio :value="2">顾客</a-radio>
      </a-radio-group>

      <a-form :model="oprUser" :label-col="{ span: 6 }" :wrapper-col="{ span: 18 }" v-show="radiovalue===1">
        <a-form-item label="登录名">
          <a-input v-model:value="oprUser.oprId" />
        </a-form-item>
        <a-form-item label="密码">
          <a-input v-model:value="oprUser.oprPassword" type="password" />
        </a-form-item>
      </a-form>

      <a-form :model="custUser" :label-col="{ span: 6 }" :wrapper-col="{ span: 18 }" v-show="radiovalue===2">
        <a-form-item label="登录名">
          <a-input v-model:value="custUser.custId" />
        </a-form-item>
        <a-form-item label="密码">
          <a-input v-model:value="custUser.custPassword" type="password" />
        </a-form-item>
      </a-form>
    </a-modal>
  </a-layout-header>
</template>

<script lang="ts">
import {computed, defineComponent, ref} from 'vue';
import axios from 'axios';
import { message} from 'ant-design-vue';
import store from "@/store";
import {useRouter} from 'vue-router'
import { QuestionCircleOutlined} from '@ant-design/icons-vue';

export default defineComponent({
  name: 'my-header',
  setup() {
    // const opr=ref();
    // opr.value={};
    const radiovalue = ref<number>(1);
    const islogin=ref(false);
    const router=useRouter();

    const opr=computed(()=>store.state.opr)
    const cust=computed(()=>store.state.cust)

    const oprUser=ref({
      //必须和后端的字段名相同
      oprId:8,
      oprPassword:"XTM8R52"
    })
    const custUser=ref({
      //必须和后端的字段名相同
      custId:7,
      custPassword:"JZRFRhvolJ"
    })
    const visible=ref(false);
    const loading=ref(false);

    const showLoginModal=()=>{
      visible.value=true
    }

    const login = () => {
      console.log("开始登录")
      // 操作员登录
      if(radiovalue.value===1) {
        loading.value = true;
        axios.post('/opr/login', oprUser.value).then((res) => {
          loading.value = false;
          const data = res.data;
          if (data.success) {
            visible.value = false;
            message.success("登录成功！");
            islogin.value=true;
            store.commit('setOpr',data.content)
          } else {
            message.error(data.message);
          }
        });
      }
      // 顾客登录
      if(radiovalue.value===2) {
        loading.value = true;
        axios.post('/drug/login', custUser.value).then((res) => {
          loading.value = false;
          const data = res.data;
          if (data.success) {
            visible.value = false;
            message.success("登录成功！");
            islogin.value=true;
            store.commit('setCust',data.content)
          } else {
            message.error(data.message);
          }
        });
      }
    };

    const logout = () => {
      console.log("退出登录");
      console.log(radiovalue.value)
      if (radiovalue.value==1) {
        axios.get('/opr/logout/'+ opr.value.token).then((res) => {
          const data = res.data;
          if (data.success) {
            message.success("退出登录成功！");
            islogin.value=false;
            store.commit("setOpr",{});
            router.push('/')
          } else {
            message.error(data.message);
          }
        });
      }
      if (radiovalue.value==2) {
        axios.get('/drug/logout/'+ cust.value.token).then((res) => {
          const data = res.data;
          if (data.success) {
            message.success("退出登录成功！");
            islogin.value=false;
            store.commit("setCust",{});
            router.push('/')
          } else {
            message.error(data.message);
          }
        });
      }
    };

    const radiochange=(e:any)=>{
      console.log(radiovalue.value)
    }

    const LoginFirstName=(name:string)=>{
      if (name!=null) {
        return name.substring(0,1);
      }
    }


    return {
      islogin,
      oprUser,
      custUser,
      visible,
      loading,
      opr,
      cust,
      showLoginModal,
      login,
      logout,

      radiovalue,
      radiochange,

      LoginFirstName
    }
  }
});
</script>

<style scoped>
.login {
  float: right;
  padding-right: 10px;
}
.loginname{
  color: #e1b12c;
}
.avatar{
  float: right;
  position: relative;
  top: 17px;
  background: #f56a00;
  margin-right:5px;
}
</style>