<template>
   <div class="header">
     <div class="nav">
       <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal">
        <el-menu-item index="1">首页</el-menu-item>
        <el-menu-item index="2">消息中心</el-menu-item>
        <el-menu-item index="3">热门</el-menu-item>
      </el-menu>
     </div>
     <div class="search">
       <el-input placeholder="请输入内容" class="input-with-select">
         <el-button slot="append" icon="el-icon-search"></el-button>
      </el-input>
     </div>
   </div>
</template>

<script>
export default {
  name: 'Header',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      activeIndex: '1'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.header{
  width: 100%;
  position: absolute;
  left: 0;
  top: 0;
  padding:0 100px 10px;
  border-bottom: 1px solid #ccc;
  background: #fff;
  box-shadow: 1px 2px 5px #ccc;
}
.header>div{
  float: left;
  margin-right: 20px;
}
.nav{
  width:240px;
}
.search{
  width: 40%;
  position: relative;
  top: 18px;
}
</style>
