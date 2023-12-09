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
          <h2>I want to work on/with open source <img src="../assets/img/emoji/rocket.webp" alt="🚀" width="32" height="32">
          </h2>
          <p>I enjoy and want to create not just for myself but also for whomever finds what I build.
            Open source projects (may) allow me to receive large amounts of feedback. I invite both people who are interested in me and people
            who just stumble upon this site to criticize me to their hearts content as my ambitions are quite lofty.
          </p>
          <p>
            My public projects or lack thereof are available on: <a href="https://github.com/NarrowsProjects"
                                                                        target="_blank">github.com/NarrowsProjects/</a>
<!--            And while you're looking at open source anyway, you might as well look at the guy who's website I blatantly stole.-->
<!--            -> <a href="https://remzi.info/">Remzi Cavdar</a>  {{'<-'}}-->
          </p>
          <p class="mb-4">
            <a href="https://app.netlify.com/sites/guust-metz/deploys"
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
            I am currently learning vue.js and Angular and am loving it thus far. I am also considering just focusing on TypeScript rather than javascript.
            Although if javascript's optional type annotations proposal comes to pass come to pass future ill likely
            switch back to it again. Regardless both are languages that I am very familiar and have grown to love with.
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