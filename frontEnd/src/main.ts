import {createApp} from 'vue'
import {createRouter, createWebHistory} from 'vue-router'
import BootstrapPlugin from './bootstrap-plugin.ts'
import 'bootstrap-icons/font/bootstrap-icons.scss'
import './main.scss'
import App from './App.vue'
import Home from '@/Home.vue'
import Resume from '@/Resume.vue'
import Portfolio from '@/Portfolio.vue'
import NotFound from '@/NotFound.vue'
import CollaborationComponent from "./components/ColaborationDocumentation/CollaborationComponent.vue";
import IssueForm from "./components/ColaborationDocumentation/IssueForm.vue";
import IssueTable from "./components/ColaborationDocumentation/IssueTable.vue";

// Routes
const routes = [
    {path: '/index.html', redirect: '/'},
    {path: '/', component: Home},
    {path: '/portfolio', component: Portfolio},
    {path: '/cv', component: Resume},
    {path: '/collaboration', component: CollaborationComponent,children: [
            { path: 'issueForm', component: IssueForm },
            { path: 'table', component: IssueTable},
        ]},
    {path: '/:pathMatch(.*)', component: NotFound}
]

const router = createRouter({
    history: createWebHistory(),
    routes,
    scrollBehavior() {
        // always scroll to top
        return {top: 0}
    },
})

createApp(App).use(router).use(BootstrapPlugin).mount('#app')

