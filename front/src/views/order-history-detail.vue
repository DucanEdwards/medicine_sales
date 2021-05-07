<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <a-button type="dashed" size="large">
        <router-link :to="'/order-history'">返回</router-link>
      </a-button>
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.orderId"
            :data-source="orderhistory"
            :loading="loading"
        >
          <template #state="{ text }">
            <span>
              <a-tag
                  :color="text == 0 ? 'volcano' : 'geekblue'"
              >
                {{ text==0?"未操作":"已操作" }}
              </a-tag>
            </span>
          </template>

          <template #sum="{record}">
            {{ (record.drugPrice.slice(1)*record.drugNum).toFixed(2)}}
          </template>

        </a-table>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {computed, defineComponent, ref,onMounted} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";
import store from "@/store";

export default defineComponent({
  name: 'OrderHistoryDetail',
  setup() {
    const route=useRoute();
    const orderhistory = ref();
    const loading = ref(false);
    const columns = [
      {
        title: '订单ID',
        dataIndex: 'orderId',
      },
      {
        title: '操作员名',
        dataIndex: 'oprName'
      },
      {
        title: '顾客名',
        dataIndex: 'custName'
      },
      {
        title: '状态',
        key:"state",
        dataIndex: 'state',
        slots: { customRender: 'state' },
      },
      {
        title: "价格",
        key:"drugPrice",
        dataIndex: 'drugPrice',
      },
      {
        title: "药品数",
        key:"drugNum",
        dataIndex: 'drugNum',
      },
      {
        title: "药品名",
        key:"drugName",
        dataIndex: 'drugName',
      },
      {
        title: "总价(￥)",
        key:"sum",
        dataIndex: 'sum',
        slots: { customRender: 'sum' },
      },
    ];

    const query=()=>{
      loading.value=true
      axios.get("/saleorder/detail/"+route.query.orderId).then((res) => {
        loading.value = false;
        const data = res.data;
        orderhistory.value = data.content;
      });
    }

    onMounted(()=>{
      query()
    })

    return {
      orderhistory,
      loading,
      columns
    }
  }
});
</script>

<style scoped>

</style>