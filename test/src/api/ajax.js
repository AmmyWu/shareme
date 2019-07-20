/* 
 封装接口
*/
import axios from 'axios'
import { Message } from 'element-ui'

//请求拦截器
axios.interceptors.request.use(function (config) {
    // 在发起请求请做一些业务处理
    console.log(config)
    return config;
    }, function (error) {
    // 对请求失败做处理
    console.log(error)
    Message.error('请求失败');
    return Promise.reject(error);
});
//响应拦截器
axios.interceptors.response.use(function (response) {
    // 对响应数据做处理
    return response;
    }, function (error) {
    // 对响应错误做处理
    Message.error('响应失败');

    return Promise.reject(error);
});
export default function ajax(url,data={},type="GET"){
    return new Promise(function(resolve,reject){
        let promise
        if(type==="GET"){
            let dataStr = '';
            Object.keys(data).forEach(key=>{
                dataStr +=key + '=' +data[key] + '&'
            })
            if(dataStr!==''){
                dataStr=dataStr.substring(0,dataStr.lastIndexOf('&'))
                url = url + '?' + dataStr
            }

            promise = axios.get(url)
        }else{
            promise = axios.post(url,data)
        }
        promise.then(function(response){
            // 成功调用 
            resolve(response.data) 
        }).catch(function(error){
            // 失败调用
            reject(error)
        })
    })
}