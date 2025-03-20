<template>
  <main class="py-4">
    <div class="container">
      <div class="row">
        <div class="col-xl-8">
          <h1>I am {{ name }}</h1>
          <p>
            I am studying Software Engineering at the Amsterdam University of Applied Sciences. My website is still bare,
            but I am working on filling it with my projects. Currently, the following sections are available:
            <div class="btn btn-link" v-for="component in componenten" @click="redirect(component)"><a>{{ component.name }}</a></div>
          </p>
          <p>
            My public projects or lack thereof are available on: <a href="https://github.com/NarrowsProjects"
                                                                        target="_blank">github.com/NarrowsProjects/</a>
          </p>
          <p class="mb-4">
            <a href="https://app.netlify.com/sites/guust-metz/deploys"
               target="_blank">
              <img src="https://api.netlify.com/api/v1/badges/87c06cec-b452-4239-ba57-5cc0a1277c2b/deploy-status"
                   alt="Build status of website">
            </a>
          </p>
          
          <h2>Prefered frameworks</h2>
          <h3>
            Ruby on Rails
            <img src="../assets/img/emoji/red-heart.webp" alt="❤" width="32" height="32">
          </h3>
          <p>
            Ruby on Rails is my framework of choice. Its convention over configuration philosophy, along with the simplicity of Ruby, makes it development a breeze.
          </p>
          <p>
            <span id="ruby-on-rails-logo">
              <img src="../assets/img/rails-svgrepo-com.svg" alt="❤" width="32" height="32">
            </span>
          </p>
          
          <h3>
            Vue.js + Typescript
            <img src="../assets/img/emoji/100.webp" alt="💯" width="32" height="32">
          </h3>
          <p>
            I am fammiliar with vue.js and it is my preffered "standard" frontend framework. I am also considering just focusing on TypeScript rather than javascript.
            Regardless, both are languages that I am very familiar with and have grown to love.
          </p>
          <p>
            <span id="vue-js-logo">
              <svg class="logo" viewBox="0 0 128 128" width="24" height="24" data-v-c0161dce="">
              <path fill="#42b883" d="M78.8,10L64,35.4L49.2,10H0l64,110l64-110C128,10,78.8,10,78.8,10z"
                    data-v-c0161dce=""></path>
              <path fill="#35495e" d="M78.8,10L64,35.4L49.2,10H25.6L64,76l38.4-66H78.8z" data-v-c0161dce=""></path>
            </svg>
            </span>
          </p>
        </div>
        <sidebar/>
      </div>
    </div>
  </main>
</template>

<script lang="ts">
import Sidebar from '@/Sidebar.vue'
interface component{
  name:string,
  redirect:string
}

export default {
  name: 'Home',
  components: {Sidebar},
  data(){
    return{
      name: "Guust Metz",
      componenten : [
        {name:"Portfolio",redirect:"portfolio"},
        {name:"Resume",redirect:"cv"},
        // {name:"Collaboration-log",redirect:"collaboration/table"}
      ] as component[]
    }
  },
  methods:{
    redirect(component:component){
    this.$router.push(component.redirect)
    }
  }
}
</script>

<style lang="scss" scoped>
svg {
  max-width: 24px;
}
</style>