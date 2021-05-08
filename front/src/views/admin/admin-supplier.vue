<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div class="horizon" :style="{ background: '#fff', padding: '24px', minHeight: '480px' }">
        <a-card v-for="item in supplier" :key="item.supplierId" :title="'ID:'+item.supplierId" style="width: 300px">
          <template #extra><router-link :to="'/admin/supplier/order?supplierId='+item.supplierId">more:进货订单</router-link></template>
          <p>Company: {{item.supplierName}}</p>
        </a-card>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, onMounted, ref} from 'vue';
import axios from "axios";

export default defineComponent({
  name: 'AdminSupplier',
  setup() {
    const supplier=ref();

    const query=()=>{
      axios.get("/supplier/list").then((res)=>{
        const data = res.data;
        supplier.value=data.content
      })
    }

    onMounted(()=>{
      query()
    })

    return {
      supplier
    }
  }
});
</script>

<style scoped>
.horizon{
  display: grid;
  grid-template-rows: repeat(2, 40%);
  grid-template-columns: repeat(4, 25%);
  row-gap:50px;
}
</style>