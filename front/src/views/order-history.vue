<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
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

          <template v-slot:druginfo="{ text, record }">
            <a-space size="small">
              <a-button type="dashed">
                <router-link :to="'/order-history/detail?orderId=' + record.orderId">
                  药品信息
                </router-link>
              </a-button>
            </a-space>
          </template>

          <template v-slot:cancel="{ text, record }">
            <a-space size="small">
              <a-button type="dashed" @click="showDeleteConfirm(record.orderId)">
                  取消订单
              </a-button>
            </a-space>
          </template>

        </a-table>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {computed, defineComponent, ref,onMounted, createVNode} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";
import store from "@/store";
import {message, Modal} from "ant-design-vue";
import { ExclamationCircleOutlined } from '@ant-design/icons-vue';

export default defineComponent({
  name: 'OrderHistory',
  setup() {
    const route=useRoute();
    const orderhistory = ref();
    const loading = ref(false);
    const cust=computed(()=>store.state.cust)
    const columns = [
      {
        title: '操作员ID',
        dataIndex: 'oprId',
      },
      {
        title: '顾客名',
        dataIndex: 'custName'
      },
      {
        title: '操作时间',
        key:"optTime",
        dataIndex: 'optTime',
      },
      {
        title: '状态',
        key:"state",
        dataIndex: 'state',
        slots: { customRender: 'state' },
      },
      {
        title: "总价(￥)",
        key:"sum",
        dataIndex: 'sum',
      },
      {
        title: "具体药品信息",
        key:"druginfo",
        dataIndex: 'druginfo',
        slots: { customRender: 'druginfo' },
      },
      {
        title: "取消订单(仅限未操作和近7日的订单)",
        key:"cancel",
        dataIndex: 'cancel',
        slots: { customRender: 'cancel' },
      },
    ];

    const query=()=>{
      loading.value=true
      axios.get("/history/list/"+cust.value.custId).then((res) => {
        loading.value = false;
        const data = res.data;
        orderhistory.value = data.content;
      });
    }

    const handleDelete=(orderId:number)=>{
      axios.delete("/history/delete/"+orderId).then((res)=>{
        const data=res.data
        if (data.success) {
          message.success("取消订单成功");
          location.reload()
        }
        else {
          message.error(data.message)
        }
      })
    }

    const showDeleteConfirm = (orderId:number) => {
      Modal.confirm({
        title: '确定取消订单?',
        icon: createVNode(ExclamationCircleOutlined),
        content: 'Confirm to cancel the order?',
        okText: 'Yes',
        okType: 'danger',
        cancelText: 'No',
        onOk() {
          handleDelete(orderId)
        },
        onCancel() {
          console.log('Cancel');
        },
      });
    };

    onMounted(()=>{
      query()
    })

    return {
      orderhistory,
      loading,
      columns,

      handleDelete,
      showDeleteConfirm
    }
  }
});
</script>

<style scoped>

</style>