<template>
  <div id="nav">
    <MyHeader></MyHeader>
    <router-view></router-view>
    <MyFooter></MyFooter>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import MyFooter from "./components/my-footer.vue"
import MyHeader from "./components/my-header.vue"

export default defineComponent({
  name: 'app',
  components:{
    MyFooter,
    MyHeader,
  },
});
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #dff9fb;
}
</style>
