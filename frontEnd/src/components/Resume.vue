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
          <h4 class="red">Skills</h4>
          <h5 class="yellow">Utility</h5>
          <article>
            <div class="skill-rating">
              <span>Dutch</span>
              <div class="rating">
                <input type="radio" name="skill-6" id="skill-3-star5" disabled><label for="skill-6-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-6" id="skill-3-star4" disabled checked><label for="skill-6-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-6" id="skill-3-star3" disabled><label for="skill-6-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-6" id="skill-3-star2" disabled><label for="skill-6-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-6" id="skill-3-star1" disabled><label for="skill-6-star1" title="1 star">▄</label>
              </div>
            </div>
            <div class="skill-rating">
              <span>English</span>
              <div class="rating">
                <input type="radio" name="skill-7" id="skill-3-star5" disabled><label for="skill-7-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-7" id="skill-3-star4" disabled checked><label for="skill-7-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-7" id="skill-3-star3" disabled><label for="skill-7-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-7" id="skill-3-star2" disabled><label for="skill-7-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-7" id="skill-3-star1" disabled><label for="skill-7-star1" title="1 star">▄</label>
              </div>
            </div>
            <div class="skill-rating">
              <span>Full stack web development</span>
              <div class="rating">
                <input type="radio" name="skill-1" id="skill-1-star5" disabled><label for="skill-1-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-1" id="skill-1-star4" disabled><label for="skill-1-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-1" id="skill-1-star3" disabled checked><label for="skill-1-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-1" id="skill-1-star2" disabled><label for="skill-1-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-1" id="skill-1-star1" disabled><label for="skill-1-star1" title="1 star">▄</label>
              </div>
            </div>
          </article>
          <h5 class="yellow">Languages & frameworks</h5>
          <article>
            <div class="skill-rating">
              <span>Java</span>
              <div class="rating">
                <input type="radio" name="skill-2" id="skill-2-star5" disabled><label for="skill-2-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-2" id="skill-2-star4" disabled checked><label for="skill-2-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-2" id="skill-2-star3" disabled><label for="skill-2-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-2" id="skill-2-star2" disabled><label for="skill-2-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-2" id="skill-2-star1" disabled><label for="skill-2-star1" title="1 star">▄</label>
              </div>
            </div>
            <div class="skill-rating">
              <span>Java/Typescript</span>
              <div class="rating">
                <input type="radio" name="skill-8" id="skill-3-star5" disabled><label for="skill-8-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-8" id="skill-3-star4" disabled ><label for="skill-8-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-8" id="skill-3-star3" disabled checked><label for="skill-8-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-8" id="skill-3-star2" disabled><label for="skill-8-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-8" id="skill-3-star1" disabled><label for="skill-8-star1" title="1 star">▄</label>
              </div>
            </div>
            <div class="skill-rating">
              <span>Vue/Vite</span>
              <div class="rating">
                <input type="radio" name="skill-3" id="skill-3-star5" disabled><label for="skill-3-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-3" id="skill-3-star4" disabled><label for="skill-3-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-3" id="skill-3-star3" checked disabled><label for="skill-3-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-3" id="skill-3-star2" disabled><label for="skill-3-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-3" id="skill-3-star1" disabled><label for="skill-3-star1" title="1 star">▄</label>
              </div>
            </div>
            <div class="skill-rating">
              <span>Angular</span>
              <div class="rating">
                <input type="radio" name="skill-12" id="skill-3-star5" disabled><label for="skill-12-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-12" id="skill-3-star4" disabled><label for="skill-12-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-12" id="skill-3-star3" disabled><label for="skill-12-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-12" id="skill-3-star2" checked disabled><label for="skill-12-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-12" id="skill-3-star1" disabled><label for="skill-12-star1" title="1 star">▄</label>
              </div>
            </div>
            <div class="skill-rating">
              <span>MySQL</span>
              <div class="rating">
                <input type="radio" name="skill-4" id="skill-3-star5" disabled><label for="skill-4-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-4" id="skill-3-star4" disabled><label for="skill-4-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-4" id="skill-3-star3" disabled checked><label for="skill-4-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-4" id="skill-3-star2" disabled><label for="skill-4-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-4" id="skill-3-star1" disabled><label for="skill-4-star1" title="1 star">▄</label>
              </div>
            </div>
            <div class="skill-rating">
              <span>Springboot</span>
              <div class="rating">
                <input type="radio" name="skill-5" id="skill-3-star5" disabled><label for="skill-5-star5" title="5 stars">▄</label>
                <input type="radio" name="skill-5" id="skill-3-star4" disabled checked><label for="skill-5-star4" title="4 stars">▄</label>
                <input type="radio" name="skill-5" id="skill-3-star3" disabled><label for="skill-5-star3" title="3 stars">▄</label>
                <input type="radio" name="skill-5" id="skill-3-star2" disabled><label for="skill-5-star2" title="2 stars">▄</label>
                <input type="radio" name="skill-5" id="skill-3-star1" disabled><label for="skill-5-star1" title="1 star">▄</label>
              </div>
            </div>
          </article>
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