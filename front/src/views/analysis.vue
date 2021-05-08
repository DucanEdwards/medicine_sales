<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 60px">
      <div :style="{ background: '#ececec', padding: '24px', minHeight: '280px' }">
        <a-row :gutter="18">
          <a-col :span="12">
            <a-card hoverable class="high">
              <a-statistic title="Today" :value="analysis.today" style="margin-right: 50px">
                <template #suffix>
                  <ClockCircleOutlined />
                </template>
              </a-statistic>
            </a-card>
          </a-col>
          <a-col :span="12">
            <a-card hoverable class="high">
              <a-statistic title="Most loyal customer" :value="analysis.loyalCustomer" class="demo-class">
                <template #suffix>
                  <LikeOutlined />
                  <UserOutlined />
                </template>
              </a-statistic>
            </a-card>
          </a-col>
        </a-row>
        <br>
        <br>
        <a-row :gutter="16">
          <a-col :span="6">
            <a-card hoverable class="high">
              <a-statistic title="订单总数" :value="analysis.orderSum" style="margin-right: 50px">
              </a-statistic>
            </a-card>
          </a-col>
          <a-col :span="6">
            <a-card hoverable class="high">
              <a-statistic title="近一月订单数" :value="analysis.orderSum30" class="demo-class">
              </a-statistic>
            </a-card>
          </a-col>
          <a-col :span="6">
            <a-card hoverable class="high">
              <a-statistic title="总销售额" :value="analysis.salesSum" class="demo-class">
                <template #suffix>
                  <span>(￥)</span>
                </template>
              </a-statistic>
            </a-card>
          </a-col>
          <a-col :span="6">
            <a-card hoverable class="high">
              <a-statistic title="近一月销售额" :value="analysis.salesSum30" class="demo-class">
                <template #suffix>
                  <span>(￥)</span>
                </template>
              </a-statistic>
            </a-card>
          </a-col>
        </a-row>
      </div>
    </a-layout-content>
  </a-layout>
</template>


<script lang="ts">
import {defineComponent, ref,onMounted} from 'vue';
import axios from "axios";

export default defineComponent({
  name: 'Analysis',
  setup() {
    const analysis=ref();
    analysis.value = {};

    const query=()=>{
      axios.get("/analysis/get-analysis").then((res=>{
        const data=res.data.content;
        analysis.value.orderSum=data[0].orderSum;
        analysis.value.orderSum30=data[0].orderSum30;
        analysis.value.salesSum=data[0].salesSum;
        analysis.value.salesSum30=data[0].salesSum30;
        analysis.value.today=data[0].today;
        analysis.value.loyalCustomer=data[0].loyalCustomer;
      }))
    }

    onMounted(()=>{
      query()
    })

    return {
      analysis
    }
  }
});
</script>


<style scoped>
.high{
  height: 150px;
}
</style>