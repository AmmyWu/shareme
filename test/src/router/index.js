import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/page/Login'
import Home from '@/page/Home'
import House from '@/page/House'
import MessageCenter from '@/page/MessageCenter'
import Popular from '@/page/Popular'

Vue.use(Router)

export default new Router({
  routes: [
    { path: '/', redirect: '/login' },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/home',
      // name: 'home',
      component: Home,
      children:[
        {
          path:'/',
          name:'house',
          component:House
        },
        {
          path:'/messageCenter',
          name:'messageCenter',
          component:MessageCenter
        },
        {
          path:'/popular',
          name:'popular',
          component:Popular
        }
      ]
    }
  ]
})
