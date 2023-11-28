<template>
  <main class="py-4">
    <div class="container">
      <div class="row">
        <div class="col-xl-8">
          <h1>I am {{ naam }}</h1>
          <p>
            I am studying Software Engineering at the Amsterdam University of Applied Sciences. My website is still bare,
            but I am working on filling it with my projects. Currently, the following sections are available:
            <div v-for="component in componenten" @click="redirect(component)"><a>{{ component.naam }}</a></div>
            <img src="../assets/img/emoji/laughing.webp" alt="😆" width="24" height="24">
          </p>
          <h2>I work with open source <img src="../assets/img/emoji/rocket.webp" alt="🚀" width="32" height="32">
          </h2>
          <p>I enjoy the creations of open-source projects and to contribute to existing ones.
            Open source, for me, is a way to share my knowledge with others and to learn from others.
            It's also a hobby that provides a great opportunity for personal development.
          </p>
          <p>
            Mijn public projecten zijn te vinden op: <a href="https://github.com/NarrowsProjects/testing"
                                                                        target="_blank">github.com/NarrowsProjects/</a>
          </p>
          <p class="mb-4">
            <a href="https://app.netlify.com/sites/remzi/deploys"
               target="_blank">
              <img src="https://api.netlify.com/api/v1/badges/87c06cec-b452-4239-ba57-5cc0a1277c2b/deploy-status"
                   alt="Build status of website">
            </a>
          </p>
          <h3>
            <img src="../assets/img/emoji/red-heart.webp" alt="❤" width="32" height="32">
            Vue.js + Typescript
            <img src="../assets/img/emoji/100.webp" alt="💯" width="32" height="32">
          </h3>
          <p>
            I am currently learning vue and react and am loving it so far. Although if javascripts has optional based typing
            in its future ill likely switch over to it again. Regardless both are languages that I am very familiar and conformable with.
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

export default {
  name: 'Home',
  components: {Sidebar},
  data(){
    return{
      naam: "Guust Metz",
      componenten : [
        {naam:"Portfolio",herleiding:"portfolio"},
        {naam:"CV",herleiding:"cv"}
      ]
    }
  },
  methods:{
    redirect(component:any){
    this.$router.push(component.herleiding)
    }
  }
}
</script>

<style lang="scss" scoped>
svg {
  max-width: 24px;
}
</style>