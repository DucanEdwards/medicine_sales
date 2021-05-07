<template>
  <div class="home">
    <a-layout class="layout">
      <a-layout-content style="padding: 0 30px">
        <div class="center img" :style="{ background: '#fff', padding: '24px', minHeight: '600px' }">
          <a-image
              :width="1000"
              src="https://www.cbdschool.com/wp-content/uploads/2017/05/CBD_Drug_Interactions-768x432.png"
          />
        </div>
      </a-layout-content>
    </a-layout>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import axios from "axios";

export default defineComponent({
  name: 'Home',
  setup() {
    console.log("sajhk");
    axios.get("/saleorder/list?custId=2").then((res)=>{
      console.log(res);
    })
  }
});
</script>

<style scoped>
.center{
  display: flex;
  justify-content: center;
  align-items: center;
}
.img {
  opacity:.7
}
</style>
