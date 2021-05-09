<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
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

          <template #confirm="{ text,record }">
            <a-button type="dashed" :disabled="record.state==1" @click="confirm(record)">确认发货</a-button>
          </template>

        </a-table>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {computed, defineComponent, onMounted, ref} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";
import store from "@/store";
// import store from "@/store";

export default defineComponent({
  name: 'AdminConfirmOrder',
  setup() {
    const route=useRoute();
    const opr=computed(()=>store.state.opr)
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
      },
      {
        title: '确认操作',
        key:"confirm",
        dataIndex: 'confirm',
        slots: { customRender: 'confirm' },
      },
    ];

    const query=()=>{
      loading.value=true
      axios.get("/opr/order/"+opr.value.oprId).then((res)=>{
        loading.value = false;
        const data = res.data;
        orderinfo.value = data.content;
      })
    }

    const confirm=(record:any)=>{
      axios.get("/saleorder/confirm-order/"+record.orderId).then((res)=>{
        loading.value = false;
        const data = res.data;
        console.log(data)
        // route.push('/admin/confirm-order');
        location.reload()
      })
    }

    onMounted(()=>{
      query()
    })

    return {
      orderinfo,
      loading,
      columns,
      confirm
    }

  }
});
</script>

<style scoped>

</style>