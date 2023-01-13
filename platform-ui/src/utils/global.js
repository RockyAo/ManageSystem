/**
 * 全局常量、方法封装模块
 * 通过原型挂载到Vue属性
 * 通过 this.Global 调用
 */

export const baseUrl = 'http://localhost:8001'

export const backupBaseUrl = 'http://localhost:8002'

export default {
  baseUrl,
  backupBaseUrl
}
