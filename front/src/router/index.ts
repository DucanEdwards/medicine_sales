import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import AdminSaleOrder from '../views/admin/admin-saleorder.vue'
import AdminOrderDetail from '../views/admin/admin-orderdetail.vue'

const routes: Array<RouteRecordRaw> = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
  {
    path: '/admin/saleorder',
    name: 'AdminSaleOrder',
    component: AdminSaleOrder
  },
  {
    path: '/admin/orderdetail',
    name: 'AdminOrderDetail',
    component: AdminOrderDetail
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
