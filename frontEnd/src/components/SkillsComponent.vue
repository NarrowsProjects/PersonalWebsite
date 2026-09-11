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
        { name: "Dutch (C2)", score: 4.5 },
        { name: "English (C2)", score: 4.5 },
        { name: "French (A1-A2)", score: 1 },
        { name: "Git Version Management", score: 4 },
        { name: "Full Stack Development", score: 4 },
        { name: "Agile Development", score: 3.5 },
      ] as skill[],
      frameWorks:[
        { name: "Java/Type - Script", score: 4 },
        { name: "Python", score: 3 },
        { name: "Vue", score: 4 },
        { name: "SpringBoot", score: 3 },
        { name: "React", score: 2.5 },
        { name: "Mithriljs", score: 4 },
      ] as skill[],
    }
  },
}
</script>

<template>
  <h2 class="red d-flex flex-grow-1 justify-content-center">Skills</h2>
  <div class="d-flex flex-row justify-content-around">
  <article>
  <h5 class="yellow">Utility</h5>
    <div class="skill-rating" v-for="(utility,index) in utilities" :key="index">
      <span>{{ utility.name }}</span>
      <div class="rating">
        <span
          v-for="number in [5, 4, 3, 2, 1]"
          :key="number"
          :class="{
            full: utility.score >= number,
            half: utility.score === number - 0.5
          }"
        >▄</span>
      </div>
    </div>
  </article>

  <article>
    <h5 class="yellow">Languages & frameworks</h5>
<div class="skill-rating" v-for="(framework, index) in frameWorks" :key="index">
  <span>{{ framework.name }}</span>

  <div class="rating">
    <span
      v-for="number in [5, 4, 3, 2, 1]"
      :key="number"
      :class="{
        full: framework.score >= number,
        half: framework.score === number - 0.5
      }"
    >▄</span>
  </div>
</div>

  </article>

  </div>


</template>

<style lang="scss" scoped>
img {
  width: 100%;
}
article{
  margin-left: 10px;
}
.rating {
  display: flex;
}

.rating span {
  color: #444;
}

.rating span.full {
  color: #FFD700;
}

.rating span.half {
  background: linear-gradient(
    to right,
    #FFD700 50%,
    #444 50%
  );
  background-clip: text;
  -webkit-background-clip: text;
  color: transparent;
}

</style>