<template>
   <div class="login">
     <el-tabs v-model="activeName">
        <el-tab-pane label="登录" name="login">
           <el-form :model="loginForm" status-icon :rules="rules2" ref="loginForm" label-width="0px" class="demo-ruleForm">
             <el-form-item prop="account">
                <el-input v-model="loginForm.account" placeholder="请输入用户名"></el-input>
              </el-form-item>
              <el-form-item prop="password">
                <el-input type="password" placeholder="请输入密码" v-model="loginForm.password" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" @click="login('loginForm')">提交</el-button>
                <!-- <el-button @click="resetForm('ruleForm')">重置</el-button> -->
              </el-form-item>
          </el-form>
            <!-- <div class='mag-b'>
              <el-input v-model="userName" placeholder="请输入用户名"></el-input>
            </div>
            <div class='mag-b'> 
              <el-input placeholder="请输入密码" v-model="userId" show-password></el-input>
            </div>
            <div class="mag-b">
              <el-button type="primary" class="loging" @click="goHome()">登录</el-button>
            </div> -->
        </el-tab-pane>
        <el-tab-pane label="注册" name="registered">
          <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="0px" class="demo-ruleForm">
             <el-form-item prop="account">
                <el-input v-model="ruleForm.account" placeholder="请输入用户名"></el-input>
              </el-form-item>
              <el-form-item prop="password">
                <el-input type="password" placeholder="请输入密码" v-model="ruleForm.password" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item prop="verifyPassword">
                <el-input type="password" placeholder="请确认密码" v-model="ruleForm.verifyPassword" autocomplete="off"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" @click="submitForm('ruleForm')">提交</el-button>
                <el-button @click="resetForm('ruleForm')">重置</el-button>
              </el-form-item>
          </el-form>
          <!-- <div class='mag-b'>
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
          </div> -->
        </el-tab-pane>
    </el-tabs>
   </div>
</template>

<script>
// export {test} from '../api'
import {register,login} from "../api"
import {mapState} from 'vuex'
export default {
  name: 'Login',
  async mounted(){
    //  const result=await test()
    //  console.log('yaya')
  },
  data () {
    var validatePass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入密码'));
      } else {
        if (this.ruleForm.verifyPassword !== '') {
          this.$refs.ruleForm.validateField('verifyPassword');
        }
        callback();
      }
    };
    var validatePass2 = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请再次输入密码'));
      } else if (value !== this.ruleForm.password) {
        callback(new Error('两次输入密码不一致!'));
      } else {
        callback();
      }
    };
    return {
      activeName: 'login',
      userName:"",
      userId:"",
      ruleForm: {
        account:'yhw',
        password: '123456',
        verifyPassword: '123456'
      },
      loginForm: {
        account:'yhw',
        password: '123456'
      },
      rules: {
        password: [
          { validator: validatePass, trigger: 'blur' }
        ],
        verifyPassword: [
          { validator: validatePass2, trigger: 'blur' }
        ],
        account: [
          { required: true,message: '请输入用户名', trigger: 'blur' }
        ]
      },
       rules2: {
        password: [
          { required: true,message: '请输入密码', trigger: 'blur' }
        ],
        account: [
          { required: true,message: '请输入用户名', trigger: 'blur' }
        ]
      }
    }
  },
  computed:{
     ...mapState(['homeList'])
  },
  methods:{
    goHome(){
      this.$router.push('/home')
    },
    // 注册
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          let data = this.ruleForm
          register(data)
          .then(function(){

          },function(){
            // this.$message.error('错了哦，这是一条错误消息');
          })
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    // 登录
    login(formName){
      this.$refs[formName].validate((valid) => {
        if (valid) {
          let data = this.loginForm
          login(data)
          .then(function(){

          },function(){
            // this.$message.error('错了哦，这是一条错误消息');
          })
        } else {
          console.log('error submit!!');
          return false;
        }
      });
    },
    resetForm(formName) {
      this.$refs[formName].resetFields();
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
