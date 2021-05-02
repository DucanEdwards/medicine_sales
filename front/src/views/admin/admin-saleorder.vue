<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.id"
            :data-source="saleorders"
            :pagination="pagination"
            :loading="loading"
            @change="handleTableChange"
        >
          <template v-slot:action="{ text, record }">
            <a-space size="small">
              <a-button type="info">
                订单细节
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
        dataIndex: 'state'
      },
      {
        title: 'Action',
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
      console.log("看看自带的分页参数都有啥：" + pagination);
      query({
        page: pagination.current,
        size: pagination.pageSize
      });
    }


    onMounted(()=>{
      query({});
    })

    return {
      columns,
      saleorders,
      pagination,
      loading,
      handleTableChange
    }

  }
});
</script>

<style scoped>

</style>