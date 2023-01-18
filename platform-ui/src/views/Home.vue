<template>
  <div class="container">
   <nav-bar></nav-bar>
   <head-bar></head-bar>
   <main-content></main-content>
</div>

</template>

<script>
// eslint-disable-next-line
import mock from '@/mock/index.js'
import NavBar from './NavBar.vue'
import HeadBar from './HeadBar.vue'
import MainContent from './MainContent.vue'

export default {
  components: { NavBar, HeadBar, MainContent }
}

</script>

<style lang="scss" scoped>
.container {
  position: absolute;
  top: 0px;
  left: 0px;
  right: 0px;
  bottom: 0px;
}
</style>
