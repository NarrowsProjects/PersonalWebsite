<template>
  <nav class="navbar navbar-expand-lg bg-body-tertiary d-print-none">
    <div class="container">
      <router-link class="navbar-brand" to="/">
        <img :src="logo" alt="Logo">
      </router-link>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#main-menu-navbar"
              aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="main-menu-navbar">
        <ul class="navbar-nav me-auto my-2 my-lg-0">
          <li class="nav-item">
            <router-link class="nav-link d-none d-lg-block" to="/">Home</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link d-none d-lg-block" to="/portfolio">Portfolio</router-link>
          </li>
          <li class="nav-item">
            <router-link class="nav-link d-lg-none" to="/cv">
              <span data-bs-toggle="collapse" data-bs-target="#main-menu-navbar">Resume</span>
            </router-link>
            <router-link class="nav-link d-none d-lg-block" to="/cv">CV</router-link>
          </li>
<!--          <li class="nav-item">-->
<!--            <router-link class="nav-link d-none d-lg-block" to="/collaboration/table">Collaboration-log</router-link>-->
<!--          </li>-->
        </ul>
      </div>
    </div>
  </nav>
</template>

<script lang="ts">
import logo from "../assets/img/logo.png"

export default {
  name: 'NavBar',
  data(){
    return{
      logo:logo
    }
  }
}
</script>

<style lang="scss" scoped>
.navbar-brand img {
  max-width: 30px;
}

#main-menu-navbar > ul > li > a.nav-link {
  --bs-nav-link-padding-y: 0;
}

#main-menu-navbar > ul > li > a.nav-link > span {
  display: block !important;
  padding: 0.5rem 0;
}
</style>