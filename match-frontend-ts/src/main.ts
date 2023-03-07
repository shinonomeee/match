import {createApp} from 'vue'
import './style.css'
import App from './App.vue'
import {Button, Icon, NavBar, Tabbar, TabbarItem} from "vant";
import * as VueRouter from "vue-router";
import routes from "./config/route";

// 创建一个router实例
const router = VueRouter.createRouter({
    // 哈希路由
    history: VueRouter.createWebHashHistory(),
    routes,
})

const app = createApp(App)
app.use(Button)
    .use(NavBar)
    .use(Icon)
    .use(Tabbar)
    .use(TabbarItem)
    .use(router)

app.mount('#app');

