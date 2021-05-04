<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.orderId"
            :data-source="operators"
            :pagination="pagination"
            :loading="loading"
            @change="handleTableChange"
        >

<!--          <template #state="{ text }">-->
<!--            <span>-->
<!--              <a-tag-->
<!--                  :color="text == 0 ? 'volcano' : 'geekblue'"-->
<!--              >-->
<!--                {{ text==0?"未操作":"已操作" }}-->
<!--              </a-tag>-->
<!--            </span>-->
<!--          </template>-->

<!--          <template v-slot:action="{ text, record }">-->
<!--            <a-space size="small">-->
<!--              <a-button type="dashed" @click="handledetail(record.orderId)">-->
<!--                <router-link :to="'/admin/orderdetail?orderId=' + record.orderId">-->
<!--                  订单细节-->
<!--                </router-link>-->
<!--              </a-button>-->
<!--            </a-space>-->
<!--          </template>-->

        </a-table>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, ref} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";

export default defineComponent({
  name: 'AdminOpr',
  setup() {
    const route=useRoute();
    const operators = ref();
    const loading = ref(false);
    const columns = [
      {
        title: '订单编号',
        dataIndex: 'orderId',
      },
      {
        title: '操作员名',
        dataIndex: 'oprName'
      },
      {
        // title: '顾客名',
        key:"custName",
        dataIndex: 'custName',
        slots: { title: 'customName'}
      },
      {
        // title: '顾客手机号', 加了title就失效
        key:"custTel",
        dataIndex: 'custTel',
        slots: { title: 'customTel'}
      },
      {
        key:"drugName",
        dataIndex: 'drugName',
        slots: { title: 'customDrug'}
      },
      {
        title: '药品数',
        dataIndex: 'drugNum',
      }
    ];

    return {
      operators
    }
  }
});
</script>

<style scoped>

</style>