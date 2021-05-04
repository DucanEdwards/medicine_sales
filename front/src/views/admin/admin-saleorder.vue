<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.orderId"
            :data-source="saleorders"
            :pagination="pagination"
            :loading="loading"
            @change="handleTableChange"
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

          <template v-slot:action="{ text, record }">
            <a-space size="small">
              <a-button type="dashed" @click="handledetail(record.orderId)">
                <router-link :to="'/admin/orderdetail?orderId=' + record.orderId">
                  订单细节
                </router-link>
              </a-button>
            </a-space>
          </template>

        </a-table>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import { defineComponent,ref,onMounted} from 'vue';
import axios from "axios";


export default defineComponent({
  name: 'AdminSaleOrder',
  setup() {
    const saleorders = ref();
    const pagination = ref({
      current: 1,
      pageSize: 10,
      total: 0
    });
    const loading = ref(false);

    const columns = [
      {
        title: '订单编号',
        dataIndex: 'orderId',
      },
      {
        title: '顾客编号',
        dataIndex: 'custId'
      },
      {
        title: '操作员编号',
        dataIndex: 'oprId'
      },
      {
        title: '操作时间',
        dataIndex: 'optTime'
      },
      {
        title: '状态',
        dataIndex: 'state',
        slots: { customRender: 'state' },
      },
      {
        title: '了解更多',
        key: 'action',
        slots: { customRender: 'action' }
      }
    ];

    const query=(params:any)=>{
      loading.value=true
      axios.get("/saleorder/list", params).then((res) => {
        loading.value = false;
        const data = res.data;
        saleorders.value = data.content;

        pagination.value.current = params.page;
      });
    }

    const handleTableChange=(pagination: any)=>{
      query({
        page: pagination.current,
        size: pagination.pageSize
      });
    }

    const handledetail=(id:number)=>{
      // axios.get("/saleorder/detail/"+id).then((res)=>{
      //   const data=res.data;
      //   if (data.success) {
      //     console.log(data.content)
      //   }
      // })
      console.log(id)
    }


    onMounted(()=>{
      query({});
    })

    return {
      columns,
      saleorders,
      pagination,
      loading,
      handleTableChange,
      handledetail
    }

  }
});
</script>

<style scoped>

</style>