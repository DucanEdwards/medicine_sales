import { createStore } from 'vuex'

declare let SessionStorage:any;

const store=createStore({
  state: {
    opr:SessionStorage.get("OPR")||{},
    cust:SessionStorage.get("CUST")||{}
  },
  mutations: {
    setOpr(state,opr) {
      state.opr=opr;
      SessionStorage.set("OPR",opr);
    },
    setCust(state,cust) {
      state.cust=cust;
      SessionStorage.set("CUST",cust);
    }
  },
  actions: {
  },
  modules: {
  }
})

export default store;