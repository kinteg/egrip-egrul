import Vue from 'vue'
import Element from 'element-ui';
import VueResource from 'vue-resource'
import 'element-ui/lib/theme-chalk/index.css'
import App from 'pages/App.vue'
import router from "router/router.js";
import localeUI from 'element-ui/lib/locale'
import defaultLang from 'element-ui/lib/locale/lang/ru-RU'
import VueRouter from 'vue-router'


localeUI.use(defaultLang);
Vue.use(VueRouter);

Vue.use(VueResource);
Vue.use(Element, { size: 'small', zIndex: 3000 });

new Vue({
    el: '#app',
    router,
    render: a => a(App)
});