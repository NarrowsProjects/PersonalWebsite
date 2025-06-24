<template>
  <main class="py-4 small">
    <div class="container">
      <div class="row d-print-none">
        <div class="col">
          <h1>My resume <i class="bi bi-file-earmark-person-fill"></i></h1>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4">
          <ProfileComponent/>
        </div>
        <div class="col-md-8">
          <h2 class="text-center">Guust Metz</h2>
          <h3 class="text-center yellow">Software Engineering student</h3>
          <hr/>
          <h4 class="red">Education</h4>
          <h5>Hogeschool van Amsterdam - 09/2022 - now</h5>
          <h6>HBO-ICT Software Engineering</h6>
          <ul>
            <li>Minor: Applied Artificial Inteligence - 09/2024 - 01/2025</li>
          </ul>
          <h5>Hogeschool InHolland - 09/2021 - 05/2022</h5>
          <h6>HBO Agri, Food & Life Sciences</h6>
          <h5>St. Patrick's college - 10/2019 - 11/2020</h5>
          <h6>Calculus, Physics, Chemistry, Biology</h6>

          <h4 class="red">Work experience</h4>
          <template v-for="workExperience of workExperiences" :key=workExperience.role>
            <h5>{{ workExperience.role}}</h5>
            <h6 class="workExperienceDetails">
              <a :href="workExperience.companyLink">{{ workExperience.company}}</a> 
              <a :href="workExperience.proofLink">{{ workExperience.job }}</a>  
              {{ workExperience.from}}
              {{ workExperience.to}}
            </h6>

          </template>
          <hr/>
        </div>
          <skillsComponent/>
      </div>
    </div>
  </main>
</template>

<script lang="ts">
import ProfileComponent from "@/profileComponent.vue";
import SkillsComponent from "@/SkillsComponent.vue";

export default {
  name: 'Resume',
  components: {SkillsComponent, ProfileComponent},
  data(){
    return {
      workExperiences:[
          {role:"Full-stack development", company:"CERN", job:"Quality Control GUI/WebUi:", from:"4/2025 - ", to:"07/2025", companyLink: 'https://home.cern/', proofLink: 'https://github.com/AliceO2Group/WebUi' },
          {role:"AI Chatbot & Evaluation System Developer",company:"Directie financiën Amsterdam:", job:"",from:"10/2024 - ", to:"01/2025", companyLink: 'https://www.amsterdam.nl/bestuur-organisatie/organisatie/bedrijfsvoering/directie-financien-inkoop/' },
          {role:"Full-stack development",company:"Klinkende Taal:",job:" Full stack Rails development:",from:"02/2024 - ", to:"08/2024", companyLink: 'https://klinkendetaal.nl/' },
          {role:"Assisting students",company:"HvA:",job:"  Student mentor : ",from:"08/2023 - ", to:"01/2024", companyLink: 'https://www.hva.nl/' },
          {role:"Leading teams",company:"Waterpolokampen.nl:",job:" Team-leader : ",from:"04/2023 - ", to:"09/2023", companyLink: 'https://waterpolokampen.nl' },
      ] as WorkExperience[]
    }
  }
}
</script>

<style lang="scss" scoped>
img {
  width: 100%;
}
article{
 margin-left: 10px;
}
</style>