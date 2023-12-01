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
  },
}
</script>

<template>
  <h4 class="red">Skills</h4>
  <h5 class="yellow">Utility</h5>
  <article>
    <div class="skill-rating" v-for="(utility,index) in utilities" :key="index">
      <span>{{ utility.name }}</span>
      <div class="rating">
        <template v-for="number in [5,4,3,2,1]" :key="number">
          <input type="radio" :name="'skill-'+index" disabled :checked="number===utility.score"><label @click="utility.score=2">▄</label>
        </template>
      </div>
    </div>

  </article>
  <h5 class="yellow">Languages & frameworks</h5>
  <article>
    <div class="skill-rating" v-for="(framework,index) in frameWorks" :key="index">
      <span>{{ framework.name }}</span>
      <div class="rating">
        <template v-for="score in [5,4,3,2,1]" :key="score">
          <input type="radio" :name="'skill-'+index+utilities.length" disabled :checked="score===framework.score"><label>▄</label>
        </template>
      </div>
    </div>
  </article>

</template>

<style lang="scss" scoped>
img {
  width: 100%;
}
article{
  margin-left: 10px;
}
</style>