import Vue from 'vue'
import VueRouter from 'vue-router'
import EgripInfo from "pages/egrip/EgripInfo.vue";
import Egrip from "pages/egrip/Egrip.vue";
import Egrul from "pages/egrul/Egrul.vue";
import EgrulInfo from "pages/egrul/EgrulInfo.vue";

Vue.use(VueRouter)

const routes = [
    { path: '/egrip/:id', component: EgripInfo },
    { path: '/egrip', component: Egrip },
    { path: '/egrul/:id', component: EgrulInfo },
    { path: '/egrul', component: Egrul },
    { path: '*', component: Egrip }
]

export default new VueRouter({
    mode: 'history',
    routes
})