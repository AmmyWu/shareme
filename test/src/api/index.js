// 调用接口的方式
import ajax from './ajax'
const base_url='/api'
//注册接口
export const register = (data)=> ajax(`${base_url}userInfoManage/register`,data,'POST')

export const test = ()=> ajax(`${base_url}userInfoManage/test`)
//登录接口
export const login = (data)=> ajax(`${base_url}userInfoManage/login`,data,'POST')