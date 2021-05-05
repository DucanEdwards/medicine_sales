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

      <a-menu-item key="/admin/confirm-order">
        <router-link to="/admin/confirm-order">操作订单</router-link>
      </a-menu-item>

      <a-menu-item key="2">统计</a-menu-item>
      <a-menu-item key="3">汇总分析</a-menu-item>

      <a class="login" @click="showLoginModal">
        <a-button type="primary">
          登录
        </a-button>
      </a>
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
import { defineComponent,ref } from 'vue';
import axios from 'axios';
import { message } from 'ant-design-vue';

export default defineComponent({
  name: 'my-header',
  setup() {
    const loginUser=ref({
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
        } else {
          message.error(data.message);
        }
      });
    };

    return {
      loginUser,
      visible,
      loading,
      showLoginModal,
      login
    }
  }
});
</script>

<style scoped>
.login {
  float: right;
}
</style>