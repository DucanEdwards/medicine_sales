<template>
  <a-layout-footer class="ft" style="text-align: center">
    医药销售系统数据库
  </a-layout-footer>
</template>

<script lang="ts">
import { defineComponent,computed } from 'vue';
import store from "@/store";

export default defineComponent({
  name: 'my-footer',
  setup() {
    const opr=computed(()=>store.state.opr)

    return {
      opr
    }

  }
});
</script>

<style scoped>
.ft {
  font-size: 17px;
}
</style>