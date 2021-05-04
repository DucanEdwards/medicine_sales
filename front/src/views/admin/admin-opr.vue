<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.orderId"
            :data-source="operators"
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
import {defineComponent, ref,onMounted} from 'vue';
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
        title: '操作员号',
        dataIndex: 'oprId',
      },
      {
        title: '操作员名',
        dataIndex: 'oprName'
      },
      {
        title: '操作员手机号',
        key:"oprTel",
        dataIndex: 'oprTel',
      },
      {
        title: '操作员性别',
        key:"oprSex",
        dataIndex: 'oprSex',
      },
      {
        title: '操作员薪资',
        key:"oprPay",
        dataIndex: 'oprPay',
      },
      {
        title: '雇佣时间',
        dataIndex: 'oprHiredate',
      }
    ];

    const query=()=>{
      loading.value=true
      axios.get("/opr/list").then((res) => {
        loading.value = false;
        const data = res.data;
        operators.value = data.content;
      });
    }

    onMounted(()=>{
      query();
    })

    return {
      operators,
      loading,
      columns
    }
  }
});
</script>

<style scoped>

</style>