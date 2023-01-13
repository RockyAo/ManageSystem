<template>
  <div class="site-wrapper site-page--not-found">
    <div class="site-content__wrapper">
      <div class="site-content">
        <h2 class="not-found-title">404 page</h2>
        <p class="not-found-desc">Oops, can not find the page</p>
        <el-button @click="$router.go(-1)">Go Back</el-button>
        <el-button type="primary" class="not-found-btn-gohome" @click="$router.push('/')">Home Page</el-button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'NotFound'
}

</script>

<style lang="scss">
  .site-wrapper.site-page--not-found {
    position: absolute;
    top: 60px;
    right: 0px;
    bottom: 0px;
    left: 0px;
    overflow: hidden;
    .site-content__wrapper {
      padding: 0px;
      margin: 0px;
      background-color: #fff;
    }
  }
</style>
