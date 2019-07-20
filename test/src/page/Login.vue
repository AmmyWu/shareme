<template>
   <div class="login">
     <el-tabs v-model="activeName">
        <el-tab-pane label="登录" name="login">
            <div class='mag-b'>
              <el-input v-model="userName" placeholder="请输入用户名"></el-input>
            </div>
            <div class='mag-b'> 
              <el-input placeholder="请输入密码" v-model="userId" show-password></el-input>
            </div>
            <div class="mag-b">
              <el-button type="primary" class="loging" @click="goHome()">登录</el-button>
            </div>
        </el-tab-pane>
        <el-tab-pane label="注册" name="registered">
          <div class='mag-b'>
            <el-input v-model="userName" placeholder="请输入用户名"></el-input>
          </div>
          <div class='mag-b'> 
            <el-input placeholder="请输入密码" v-model="userId" show-password></el-input>
          </div>
          <div class='mag-b'> 
            <el-input placeholder="请再次输入密码" v-model="userId" show-password></el-input>
          </div>
          <div class="mag-b">
            <el-button type="primary" class="loging">注册</el-button>
            {{homeList}}
          </div>
        </el-tab-pane>
    </el-tabs>
   </div>
</template>

<script>
// export {test} from '../api'
import {mapState} from 'vuex'
export default {
  name: 'Login',
  async mounted(){
    //  const result=await test()
    //  console.log('yaya')
  },
  data () {
    return {
      activeName: 'login',
      userName:"",
      userId:"",
      home:this.$store.state.homeList
    }
  },
  computed:{
     ...mapState(['homeList'])
  },
  methods:{
    goHome(){
      this.$router.push('/home')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
 .login{
   width: 380px;
   position: absolute;
   top: 30%;
   left: 50%;
   transform: translateX(-50%);
 }
 .mag-b{
   margin-bottom: 20px;
 }
 .loging{
   width:70%;
 }
 #tab-login{
   width: 190px;
 }
 #tab-registered{
   width: 190px;
 }
</style>
