<template>
  <div class="home">
    <a-layout class="layout">
      <a-layout-content style="padding: 0 30px">
        <div :style="{ background: '#fff', padding: '24px', minHeight: '280px' }">
          Home
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
