<template>
  <div class="page">
      <h2>Login page</h2>
      <el-button type="primary" @click="login()">登录</el-button>
  </div>
</template>

<script>
// eslint-disable-next-line
import mock from '@/mock/index.js'
import router from '@/router'
import Cookies from 'js-cookie'

export default {
  name: 'Login',
  methods: {
    login() {
      this.$api.login.login().then((res) => {
        alert(res.token)
        Cookies.set('token', res.token)
        router.push('/')
      }).catch((res) => {
        alert(res)
      })
    }
  }
}

</script>
