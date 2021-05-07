<template>
  <a-layout class="layout">
    <a-layout-content style="padding: 0 30px">
      <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
        <a-table
            :columns="columns"
            :row-key="record => record.drugName"
            :data-source="druginfo"
            :pagination="pagination"
            :loading="loading"
            @change="handleTableChange"
        >
          <template #addtobasket="{ text,record }">
            <a-button type="dashed" shape="circle" @click="addtobasket(record)">+</a-button>
          </template>


        </a-table>

        <a-row>
          <a-col :span="12">
            <div v-if="basket.length > 0">
              <table class="table">
                <thead class="head-default">
                <tr>
                  <th>数量</th>
                  <th>药品</th>
                  <th>价格</th>
                </tr>
                </thead>
                <tbody v-for="item in basket" :key="item.drugName">
                <tr>
                  <td>
                    <button @click="decreaceQuantity(item)" class="btn btn-sm">-</button>
                    <span>{{item.quantity}}</span>
                    <button @click="increaceQuantity(item)" class="btn btn-sm">+</button>
                  </td>
                  <td>{{item.drugName}}</td>
                  <td>{{item.drugPrice.slice(1)*item.quantity}}</td>
                </tr>
                </tbody>
              </table>
              <p>总价：{{total +'RMB'}}</p>
            </div>
            <div v-else><h3>{{basketsText}}</h3></div>
          </a-col>
          <a-col :span="12">
            <a-button class="right-bottom" type="primary" @click="buy()">购买</a-button>
          </a-col>
        </a-row>
      </div>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, onMounted, ref,computed} from 'vue';
import axios from "axios";
import {useRoute} from "vue-router";
import {message} from "ant-design-vue";
import store from "@/store";

export default defineComponent({
  name: 'BuyMedicine',
  setup() {
    const basket=ref();
    basket.value=[]
    const cust=computed(()=>store.state.cust)
    const basketsText=ref("没有添加任何药品");
    const total=computed(()=>{
      let cost=0
      basket.value.forEach((medicine:any)=>{
        cost+=medicine.quantity*medicine.drugPrice.slice(1)
      })
      return cost
    })

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
        title: '添加',
        key:"add",
        dataIndex: 'add',
        slots: { customRender: 'addtobasket' },
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

    // 添加到购物车
    const addtobasket=(record:any)=>{
      let medicine={
        drugId:record.drugId,
        drugName:record.drugName,
        drugPrice:record.drugPrice,
        sortName:record.sortName,
        quantity:1
      }
      if (basket.value.length>0) {
        let result=basket.value.filter((medicine:any)=> {
          return medicine.drugName===record.drugName
        })
        if (result!=null && result.length>0) {
          result[0].quantity++
        }else {
          basket.value.push(medicine);
        }
      }else {
        basket.value.push(medicine);
      }
    }

    const decreaceQuantity=(item:any)=>{
      item.quantity--
      if (item.quantity<=0) {
        removeFromBakets(item)
      }
    }

    const increaceQuantity=(item:any)=>{
      item.quantity++
    }

    const removeFromBakets=(item:any) =>{
      basket.value.splice(basket.value.indexOf(item),1)
    }

    const buy=()=>{
      let buyinfo={
        custId:cust.value.custId,
        basket:basket.value
      }
      loading.value=true
      axios.post("/drug/buy",buyinfo).then((res) => {
        loading.value = false;
        const data = res.data;
        message.success(data.content);
      });
    }

    onMounted(()=>{
      query({});
    })

    return {
      basket,
      basketsText,
      druginfo,
      loading,
      columns,
      pagination,
      total,
      handleTableChange,

      buy,
      addtobasket,
      decreaceQuantity,
      increaceQuantity
    }
  }
});
</script>

<style scoped>
.right-bottom {
  position: absolute;
  right:0;
  bottom: 10px;
}
</style>