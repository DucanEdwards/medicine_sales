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
      <a-menu-item key="/admin/saleorder">
        <router-link to="/admin/saleorder">销售查询</router-link>
      </a-menu-item>
      <a-menu-item key="2">统计</a-menu-item>
      <a-menu-item key="3">汇总分析</a-menu-item>
    </a-menu>
  </a-layout-header>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'my-header',
});
</script>

<style scoped>

</style>