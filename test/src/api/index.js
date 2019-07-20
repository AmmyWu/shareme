// 调用接口的方式
import ajax from './ajax'
const base_url='/api'
//登录接口
export const login = (data)=> ajax(`userInfoManage/login`,data,'POST')

export const test = ()=> ajax(`${base_url}userInfoManage/test`)