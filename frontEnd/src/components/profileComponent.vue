<script  lang="ts">
import  profileImage from "../assets/img/CVfotoGuust.png"
export default {
  name:"ProfileComponent",
  data(){
    return{
      profileImage:profileImage
    }
  }
}
</script>
<template>
  <div class="card mb-3" style="width: 100%;">
    <img :src="profileImage" class="card-img-top" alt="Profile image">
    <div class="card-body">
      <h6 class="card-title">Profile</h6>
      <p class="card-text small">
        I am Guust, an active and ambitious software engineering student who wants to apply his skillset in meaningfull ways.   
        I'm especially interested in contributing to scientific progress, using technology to better understand complicated problems.
      </p>
      <p class="small">
        <strong><i class="bi bi-phone"></i> Phone number:</strong> <a href="tel:+31636587923">06 365 879 23</a><br>
        <strong><i class="bi bi-envelope-at"></i> E-mail:</strong> <a
          href="mailto:metzguust@gmail.com">metzguust@gmail.com</a><br>
        <strong><i class="bi bi-map"></i> Nationality:</strong> Dutch<br>
        <strong><i class="bi bi-linkedin"></i> LinkedIn:</strong> <a
          href="https://www.linkedin.com/in/guust-metz-785025254/" target="_blank">linkedin.com/in/guust-metz-785025254/</a><br>
      </p>
    </div>
  </div>

</template>

<style scoped lang="scss">
.card-img-top{
  max-width: 50vw;
}
</style>