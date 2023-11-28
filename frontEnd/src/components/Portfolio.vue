<template>
  <main class="py-4">
    <div class="container">
      <div class="row">
        <div class="col-xl-8">
          <h1>My portfolio <img src="../assets/img/emoji/rocket.webp" alt="🚀" width="50" height="50"></h1>
          <p>
            I have yet to make any personal projects on my github
          </p>
        </div>
      </div>
    </div>
    <div class="px-4 my-5 text-center border-bottom">
      <div class="col-lg-6 mx-auto">
        <p class="lead mb-4">        </p>
        <div class="d-grid gap-2 d-sm-flex justify-content-sm-center mb-5">

        </div>
      </div>
      <div class="overflow-hidden" style="max-height: 30vh;">
        <div class="container px-5">

        </div>
      </div>
    </div>
  </main>
</template>

<script lang="ts">
import Sidebar from '@/Sidebar.vue'

export default {
  name: 'Portfolio',
  components: {Sidebar}
}
</script>

<style lang="scss" scoped>
.cover-image {
  width: 700px;
}
</style>