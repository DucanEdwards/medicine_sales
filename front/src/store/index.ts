import { createStore } from 'vuex'

declare let SessionStorage:any;

const store=createStore({
  state: {
    opr:SessionStorage.get("OPR")||{}
  },
  mutations: {
    setOpr(state,opr) {
      state.opr=opr;
      SessionStorage.set("OPR",opr);
    }
  },
  actions: {
  },
  modules: {
  }
})

export default store;