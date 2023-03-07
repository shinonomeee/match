import Index from "../views/Index.vue";
import Team from "../views/Team.vue";
import My from "../views/My.vue";

const routes = [
    { path: '/', component: () => Index },
    { path: '/team', component: () => Team },
    { path: '/my', component: () => My }
]

export default routes;