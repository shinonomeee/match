import {createApp} from 'vue'
import './style.css'
import App from './App.vue'
import {Button, Icon, NavBar, Tabbar, TabbarItem} from "vant";

const app = createApp(App)
app.use(Button)
    .use(NavBar)
    .use(Icon)
    .use(Tabbar)
    .use(TabbarItem)
app.mount('#app');

