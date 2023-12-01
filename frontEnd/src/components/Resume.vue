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
          <skillsComponent/>
        </div>
        <div class="col-md-8">
          <h2 class="text-center">Guust Metz</h2>
          <h3 class="text-center yellow">Software Engineering student</h3>
          <hr/>
          <h4 class="red">Education</h4>
          <h5>Hogeschool van Amsterdam - 09/2022 - now</h5>
          <h6>HBO-ICT Software Engineering</h6>
          <h5>Hogeschool InHolland - 09/2021 - 05/2022</h5>
          <h6>HBO Agri, Food & Life Sciences</h6>
          <h5>St. Patrick's college - 10/2019 - 11/2020</h5>
          <h6>Calculus,Physics,Chemistry,Biology</h6>

          <h4 class="red">Work experience</h4>
          <h5>Assisting Students</h5>
          <h6>HvA : Student mentor - 08/2023 - now</h6>
          <h6>Volunteer : Physics tutor - 12/2019 - 06/2020</h6>
          <h5>Leading teams</h5>
          <h6>Waterpolokampen.nl : Team-leader - 04/2023 - 09/2023</h6>
          <h5>Working with teams</h5>
          <h6>Menzies aviation : Platform employee - 01/2023 - 04/2023</h6>
          <hr/>

        </div>
      </div>
    </div>
  </main>
</template>

<script lang="ts">
import ProfileComponent from "@/profileComponent.vue";
import SkillsComponent from "@/SkillsComponent.vue";

export default {
  name: 'Resume',
  components: {SkillsComponent, ProfileComponent}
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