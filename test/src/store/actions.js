/*
通过mutation间接更新state的多个对象的方法
*/

import {HOMEPAGE_LIST,REQUEST_REGISTER} from "./mutations-types"
import {test,register} from "../api"


export default{
    addList({commit,state}){
       test()
       .then(function(res){
          console.log(res)
          const homeList=res
          commit(HOMEPAGE_LIST,{homeList})
       },function(){
           console.log("失败")
           const homeList="error"
           commit(HOMEPAGE_LIST,{homeList})
       })
    },
    registerDetail({commit,state}){
        register()
        .then(function(res){
           console.log(res)
           const register=res
           commit(REQUEST_REGISTER,{register})
        },function(){
            console.log("失败")
            const register="error"
            commit(REQUEST_REGISTER,{register})
        })
     }
}