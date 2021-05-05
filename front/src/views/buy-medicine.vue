<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.oprId"
            :data-source="druginfo"
            :pagination="pagination"
            :loading="loading"
            @change="handleTableChange"
        >
        </a-table>
        <a-button class="right-bottom" type="primary">购买</a-button>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, onMounted, ref} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";

export default defineComponent({
  name: 'BuyMedicine',
  setup() {
    const route=useRoute();
    const druginfo = ref();
    const loading = ref(false);
    const pagination = ref({
      current: 1,
      pageSize: 7,
      total: 0
    });
    const columns = [
      {
        title: '药品名',
        dataIndex: 'drugName',
      },
      {
        title: '药品价格',
        dataIndex: 'drugPrice'
      },
      {
        title: '药品类别名',
        key:"sortName",
        dataIndex: 'sortName',
      },
      {
        title: '过期时间',
        key:"expireDate",
        dataIndex: 'expireDate',
      },
      {
        title: '数量',
        key:"num",
        dataIndex: 'num',
      },
    ];

    const query=(params:any)=>{
      loading.value=true
      axios.get("/drug/list",params).then((res) => {
        loading.value = false;
        const data = res.data;
        druginfo.value = data.content;

        pagination.value.current = params.page;
      });
    }

    const handleTableChange=(pagination: any)=>{
      query({
        page: pagination.current,
        size: pagination.pageSize
      });
    }

    onMounted(()=>{
      query({});
    })

    return {
      druginfo,
      loading,
      columns,
      pagination,
      handleTableChange
    }
  }
});
</script>

<style scoped>
.right-bottom {
  position: relative;
  left: 1350px;
}
</style>