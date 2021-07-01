import Vue from 'vue'
import App from './App.vue'
import User from './components/User.vue'
import Blog from './components/Blog.vue'
import Account from './components/Account.vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter);

const routes = [
  { path: '/blog', component: Blog},
  { path: '/account', component: Account},
  { path: '/', component: User}
]

//Global use
Vue.component('app-user', User);

new Vue({
  el: '#app',
  render: h => h(App)
})
