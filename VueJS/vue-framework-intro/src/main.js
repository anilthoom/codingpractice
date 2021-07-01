import Vue from 'vue'
import App from './App.vue'
import User from './components/User.vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter);

//Global use
Vue.component('app-user', User);

new Vue({
  el: '#app',
  render: h => h(App)
})
