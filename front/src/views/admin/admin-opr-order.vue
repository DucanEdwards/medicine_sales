<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <a-button type="dashed" size="large">
        <router-link :to="'/admin/opr'">返回</router-link>
      </a-button>
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.orderId"
            :data-source="orderinfo"
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
        </a-table>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, ref,onMounted} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";

export default defineComponent({
  name: 'AdminOprOrder',
  setup() {
    const route=useRoute();
    const orderinfo = ref();
    const loading = ref(false);

    const columns = [
      {
        title: '订单号',
        dataIndex: 'orderId',
      },
      {
        title: '操作员名',
        dataIndex: 'oprName'
      },
      {
        title: '顾客名',
        key:"custName",
        dataIndex: 'custName',
      },
      {
        title: '订单状态',
        key:"state",
        dataIndex: 'state',
        slots: { customRender: 'state' },
      }
    ];

    const query=()=>{
      loading.value=true
      axios.get("/opr/order/"+route.query.oprId).then((res)=>{
        loading.value = false;
        const data = res.data;
        orderinfo.value = data.content;
      })
    }

    onMounted(()=>{
      query()
    })

    return {
      orderinfo,
      loading,
      columns
    }

  }
});
</script>

<style scoped>

</style>