<template>
   <div class="header">
     <div class="nav">
       <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal">
        <el-menu-item index="1"><router-link :to="{name:'house'}">首页</router-link></el-menu-item>
        <el-menu-item index="2"><router-link :to="{path:'/messageCenter'}">消息中心</router-link></el-menu-item>
        <el-menu-item index="3"><router-link :to="{name:'popular'}">热门</router-link></el-menu-item>
      </el-menu>
     </div>
     <div class="search">
       <el-input placeholder="请输入内容" class="input-with-select">
         <el-button slot="append" icon="el-icon-search"></el-button>
      </el-input>
     </div>
     <ul class='right'>
        <li>
          <el-dropdown>
            <span class="el-dropdown-link">
              <el-badge :value="null" class="item">
                <i class="el-icon-message-solid" style="font-size:25px;"></i>
                <!-- <el-button size="small">评论</el-button> -->
              </el-badge>
              <!-- <i class="el-icon-message-solid"></i> -->
            </span>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item divided>黄金糕</el-dropdown-item>
              <el-dropdown-item>狮子头</el-dropdown-item>
              <el-dropdown-item>螺蛳粉</el-dropdown-item>
              <el-dropdown-item divided>更多……</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </li>
        <li>
          <el-dropdown>
            <span class="el-dropdown-link">
              <el-badge :value="null" class="item">
                <i class="el-icon-chat-line-round" style="font-size:25px;"></i>
                <!-- <el-button size="small">评论</el-button> -->
              </el-badge>
              <!-- <i class="el-icon-message-solid"></i> -->
            </span>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item divided>黄金糕</el-dropdown-item>
              <el-dropdown-item>狮子头</el-dropdown-item>
              <el-dropdown-item>螺蛳粉</el-dropdown-item>
              <el-dropdown-item divided>更多……</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </li>
        <li>
          <el-dropdown>
            <span class="el-dropdown-link">
              <el-badge :value="null" class="item">
                <i class="el-icon-user-solid" style="font-size:25px;"></i>
                <!-- <el-button size="small">评论</el-button> -->
              </el-badge>
              <!-- <i class="el-icon-message-solid"></i> -->
            </span>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>设置</el-dropdown-item>
              <el-dropdown-item divided>退出</el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
        </li>
     </ul>
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
  /* width: 100%; */
  position: absolute;
  left: 0;
  top: 0;
  right:0;
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
.header>ul{
  list-style-type: none;
  float: right;
  margin: 0;
  padding: 0;
  margin-top:27px; 
}
.header>ul li{
  float: left;
  margin-right: 60px;
}


a {
  text-decoration: none;
}
 
.router-link-active {
  text-decoration: none;
}
</style>
