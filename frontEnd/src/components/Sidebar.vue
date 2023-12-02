<template>
  <div class="col-xl-3 ms-auto">
    <h2>My business card <i class="bi bi-person-lines-fill"></i></h2>
    <p>
      <strong><i class="bi bi-person"></i> Name:</strong> Guust Metz<br>
      <strong><i class="bi bi-house"></i> Home town:</strong> Zaandam<br>
      <strong><i class="bi bi-phone"></i> Phone number:</strong> <a href="tel:+31636587923">06 36 58 7923</a><br>
      <strong><i class="bi bi-envelope-at"></i> E-mail:</strong> <a
        href="mailto:metzguust@gmail.com">metzguust@gmail.com</a><br>
      <strong><i class="bi bi-envelope-at"></i> E-mail HvA:</strong> <a
        href="mailto:guust.metz@hva.nl">guust.metz@hva.nl</a>
    </p>
    <h3>Portfolio</h3>
    <p>
      <strong><i class="bi bi-linkedin"></i> LinkedIn:</strong> <a
        href="https://www.linkedin.com/in/guustmetz" target="_blank">linkedin.com/in/guustMetz</a><br>
      <strong><i class="bi bi-github"></i> GitHub:</strong> <a href="https://github.com/NarrowsProjects"
                                                               target="_blank">github.com/NarrowsProjects/</a>
    </p>
    <p>
      <a class="btn btn-primary" :href="resume"
         role="button" download="Curriculum-vitae–G.Metz.pdf">Download Resume</a>
    </p>
  </div>
</template>

<script lang="ts">
import  resume from "../assets/Resume.pdf"

export default {
  name: 'Sidebar',
  data(){
    return{
      resume:resume
    }
  }
}
</script>