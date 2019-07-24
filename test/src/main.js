// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import store from "./store"

Vue.use(ElementUI)



Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})


// 导航守卫
// 参数1 : to 目标路由对象
// 参数2 : from 来源路由对象
// 参数3 : next() 下一步
router.beforeEach((to, from, next) => {
  // 1. 判断是不是登录页面
  // 是登录/注册页面
  if (to.path === '/login') {
    next()
  } else {
    // 不是登录/注册页面
    // 2. 判断 是否登录过
    let user = localStorage.getItem('user')
    user ? next() : next('/login')
  }
})