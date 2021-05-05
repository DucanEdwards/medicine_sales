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

      <a-menu-item key="/admin/opr">
        <router-link to="/admin/opr">操作员</router-link>
      </a-menu-item>

      <a-menu-item key="/admin/saleorder">
        <router-link to="/admin/saleorder">销售查询</router-link>
      </a-menu-item>

      <a-menu-item key="/admin/confirm-order" :style="opr.oprId?{}:{display:'none'}">
        <router-link to="/admin/confirm-order">操作订单</router-link>
      </a-menu-item>

      <a-menu-item key="/buy-medicine">
        <router-link to="/buy-medicine">购买药品</router-link>
      </a-menu-item>

      <a-menu-item key="2">统计</a-menu-item>
      <a-menu-item key="3">汇总分析</a-menu-item>

      <a class="login" @click="showLoginModal" v-show="!opr.oprId">
        <a-button type="primary">
          登录
        </a-button>
      </a>
      <a class="login" v-show="opr.oprId">
        <a-tag class="loginname">
          {{ opr.oprName }}
        </a-tag>
      </a>

      <a-popconfirm
          title="Confirm Logout?"
          ok-text="Yes"
          cancel-text="No"
          @confirm="logout()"
      >
        <a class="login" v-show="opr.oprId">
          <a-button type="primary">
            退出登录
          </a-button>
        </a>
      </a-popconfirm>
    </a-menu>

    <a-modal v-model:visible="visible" :confirmLoading="loading" title="Login" @ok="login">
      <a-form :model="loginUser" :label-col="{ span: 6 }" :wrapper-col="{ span: 18 }">
        <a-form-item label="登录名">
          <a-input v-model:value="loginUser.oprId" />
        </a-form-item>
        <a-form-item label="密码">
          <a-input v-model:value="loginUser.oprPassword" type="password" />
        </a-form-item>
      </a-form>
    </a-modal>
  </a-layout-header>
</template>

<script lang="ts">
import {computed, defineComponent, ref} from 'vue';
import axios from 'axios';
import { message } from 'ant-design-vue';
import store from "@/store";
import {useRouter} from 'vue-router'

export default defineComponent({
  name: 'my-header',
  setup() {
    // const opr=ref();
    // opr.value={};
    const router=useRouter();
    const opr=computed(()=>store.state.opr)

    const loginUser=ref({
      //必须和后端的字段名相同
      oprId:1,
      oprPassword:"DMcv3v8AxaKE"
    })
    const visible=ref(false);
    const loading=ref(false);

    const showLoginModal=()=>{
      visible.value=true
    }

    const login = () => {
      console.log("开始登录")
      loading.value = true;
      axios.post('/opr/login', loginUser.value).then((res) => {
        loading.value = false;
        const data = res.data;
        if (data.success) {
          visible.value = false;
          message.success("登录成功！");
          store.commit('setOpr',data.content)
        } else {
          message.error(data.message);
        }
      });
    };

    const logout = () => {
      console.log("退出登录");
      axios.get('/opr/logout/'+ opr.value.token).then((res) => {
        const data = res.data;
        if (data.success) {
          message.success("退出登录成功！");
          store.commit("setOpr",{});
          router.push('/')
        } else {
          message.error(data.message);
        }
      });
    };

    return {
      loginUser,
      visible,
      loading,
      opr,
      showLoginModal,
      login,
      logout
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
</style>