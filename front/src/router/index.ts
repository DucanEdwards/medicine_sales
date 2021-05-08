import { createRouter, createWebHistory, RouteRecordRaw } from 'vue-router'
import Home from '../views/Home.vue'
import AdminSaleOrder from '../views/admin/admin-saleorder.vue'
import AdminOrderDetail from '../views/admin/admin-orderdetail.vue'
import AdminOpr from '../views/admin/admin-opr.vue'
import AdminOprOrder from '../views/admin/admin-opr-order.vue'
import AdminConfirmOrder from '../views/admin/admin-confirm-order.vue'
import BuyMedicine from '../views/buy-medicine.vue'
import OrderHistory from '../views/order-history.vue'
import OrderHistoryDetail from '../views/order-history-detail.vue'
import AdminSupplier from '../views/admin/admin-supplier.vue'
import AdminSupplierOrder from '../views/admin/admin-supplier-order.vue'
import Analysis from '../views/analysis.vue'

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
  {
    path: '/admin/opr',
    name: 'AdminOpr',
    component: AdminOpr
  },
  {
    path: '/admin/opr/order',
    name: 'AdminOprOrder',
    component: AdminOprOrder
  },
  {
    path: '/admin/confirm-order',
    name: 'AdminConfirmOrder',
    component: AdminConfirmOrder
  },
  {
    path: '/buy-medicine',
    name: 'BuyMedicine',
    component: BuyMedicine
  },
  {
    path: '/order-history',
    name: 'OrderHistory',
    component: OrderHistory
  },
  {
    path: '/order-history/detail',
    name: 'OrderHistoryDetail',
    component: OrderHistoryDetail
  },
  {
    path: '/admin/supplier',
    name: 'AdminSupplier',
    component: AdminSupplier
  },
  {
    path: '/admin/supplier/order',
    name: 'AdminSupplierOrder',
    component: AdminSupplierOrder
  },
  {
    path: '/analysis',
    name: 'Analysis',
    component: Analysis
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
