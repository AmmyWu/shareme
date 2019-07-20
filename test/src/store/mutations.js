/*
直接更新state的多个对象的方法
*/


import {HOMEPAGE_LIST,REQUEST_REGISTER} from "./mutations-types"
import { Notification } from 'element-ui';
export default{
   [HOMEPAGE_LIST] (state,{homeList}){
       state.homeList = homeList
       Notification({
        title: '成功',
        message: homeList,
        type: 'success',
        duration:2000
      });
   },
   [REQUEST_REGISTER] (state,{homeList}){
      state.homeList = homeList
      Notification({
       title: '成功',
       message: '注册成功',
       type: 'success',
       duration:2000
     });
  }
}