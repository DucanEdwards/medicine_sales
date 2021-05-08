<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.purchaseId"
            :data-source="supplierorder"
            :loading="loading"
        >

          <template #sum="{ record }">
            <a-tag  color="processing">
              {{ (record.drugNum*record.purchasePrice.slice(1)).toFixed(2)}}
            </a-tag>
          </template>

        </a-table>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, onMounted, ref} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";

export default defineComponent({
  name: 'AdminSupplierOrder',
  setup() {
    const route=useRoute();
    const supplierorder=ref();
    const loading = ref(false);
    const columns = [
      {
        title: '进货订单ID',
        dataIndex: 'purchaseId',
      },
      {
        title: '操作员名',
        dataIndex: 'oprName'
      },
      {
        title: '药品名',
        key:"drugName",
        dataIndex: 'drugName',
      },
      {
        title: '药品数',
        key:"drugNum",
        dataIndex: 'drugNum',
      },
      {
        title: "供货商名",
        key:"supplierName",
        dataIndex: 'supplierName',
      },
      {
        title: "进货单价",
        key:"purchasePrice",
        dataIndex: 'purchasePrice',
      },
      {
        title: "进货总价(￥)",
        key:"sum",
        dataIndex: 'sum',
        slots: { customRender: 'sum' },
      },
    ];

    const query=()=>{
      axios.get("/supplier/order/"+route.query.supplierId).then((res)=>{
        const data = res.data;
        supplierorder.value=data.content
        console.log(data)
      })
    }

    onMounted(()=>{
      query()
    })

    return {
      supplierorder,
      loading,
      columns
    }
  }
});
</script>

<style scoped>

</style>