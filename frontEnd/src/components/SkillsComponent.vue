<script  lang="ts">
interface skill{
  name: string,
  score: number
}
export default {
  name:"SkillsComponent",
  data(){
    return{
      utilities:[
        {name: "Dutch",score: 4},
        {name: "English",score:5},
        {name: "Full Stack Development",score:3}
      ] as skill[],
      frameWorks:[
        {name: "Java",score: 4},
        {name: "Java/Type - Script",score:3},
        {name: "Vue/Vite",score:3},
        {name: "Angular",score:2},
        {name: "SpringBoot",score:4},
        {name: "MySQL",score:3},
      ] as skill[],
    }
  }

}
</script>

<template>
  <h4 class="red">Skills</h4>
  <h5 class="yellow">Utility</h5>
  <article>

    <div class="skill-rating" v-for="(utility,index) in utilities" :key="index">
      <span>{{ utility.name }}</span>
      <div class="rating">
        <div v-for="score in [1,2,3,4,5]">
          <input type="radio" :name="'skill-'+index" disabled><label :for="'skill-'+index+'-star'+score" :title="score+ 'stars'">▄</label>
        </div>
       </div>
    </div>

  </article>
  <h5 class="yellow">Languages & frameworks</h5>
  <article>
    <div class="skill-rating" v-for="(framework,index) in frameWorks" :key="index">
      <span>{{ framework.name }}</span>
      <div class="rating">
        <input v-for="score in [1,2,3,4,5]" :key="score" type="radio" :name="'skill-'+index" disabled :checked="score==framework.score"><label>▄</label>
      </div>
    </div>
  </article>

</template>

<style scoped lang="scss">

</style>