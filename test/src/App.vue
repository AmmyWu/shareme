<template>
  <div id="app">
    <!-- <img src="./assets/logo.png"> -->
    
    <transition name="fade">
        <router-view/>
    </transition>
  </div>
</template>

<script>
// import {test} from './api'
import {mapState} from 'vuex'
export default {
  name: 'App',
  computed:{
    ...mapState(['homeList'])
  },
  mounted(){
    // test()
    // this.$store.dispatch('addList')
     
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  /* margin-top: 60px; */
}


.fade-enter {
  opacity:0;
}
.fade-leave{
  opacity:1;
}
.fade-enter-active{
  transition:opacity .5s;
}
.fade-leave-active{
  opacity:0;
  transition:opacity .5s;
}
</style>
