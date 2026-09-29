<script  lang="ts">
export default {
  name:"ProfileComponent",
  data(){
    return {
      personalProjects: [
        {
          title: "Spine 4.0 JSON to Blender 3.4 mesh converter add-on",
          proofLink: "https://github.com/NarrowsProjects/blender_json_to_mesh_spine_4.0_builder",
          description: "Allows users to import spine 4.0 JSON skeleton exports into blender 3.4",
          technologies: ["Python 3.10", "Blender Python API 3.4"],
        },
        {
          title: "Rust database energy benchmarker for hierarchical data",
          proofLink: "https://github.com/NarrowsProjects/database-energy-benchmarker",
          description: `Compares energy expendature per query for hierarchical data between PostgreSQL 17.4+ and MongoDB 8.06 using Intel PCM.
            Provides instructions on how to add different databases for comparison.`,
          technologies: ["Rust 1.83+", " PostgreSQL 17.4", "MongoDB 8.06"],
        },
        {
          title: "Red tool replenishment mod for Hollow Knight: Silksong",
          proofLink: "https://github.com/NarrowsProjects/Silksong.ReplenishTools",
          description: "Overhauls how red tools are managed in Hollow Knigh Silksong.",
          technologies: ["C#", "BepInEx"],
        },
        {
          title: "Custom UABEA build",
          proofLink: "https://github.com/NarrowsProjects/UABEA-Custom",
          description: `Small changes to the base UABEA repository.
            Changes how plugins are handled by the application
            Allows users to save their changes from the info window rather than having to return to main menu.
          `,
          technologies: ["C#", ".NET 8.0", "Avalonia UI"],
        },
        {
          title: "Grocery list application",
          proofLink: "https://github.com/NarrowsProjects/boodschappenlijst",
          description: "Simple Ruby on Rails application used to list groceries",
          technologies: ["Ruby on Rails 8.0.2"],
        },
      ] as PersonalProject[]
    }
  }
}
</script>

<template>
  <h2 class="red d-flex flex-grow-1 justify-content-center mb-4 title">Personal Projects</h2>
  <div class="d-flex flex-row justify-content-around">
    <div class="projectDetails">
      <div v-for="project of personalProjects" :key=project.title> 
        <h5 class="d-flex gap-2">
          <div class="yellow">{{ project.title }}</div>
        </h5>
        <h6 class="ms-2" >
          <div class="ml-2 d-flex gap-1">
            <strong class="flex-shrink-0">GitHub Repository:</strong>
            <a class="repository-link" :href="project.proofLink">{{ project.proofLink?.replace('https://github.com', '') }}</a>
          </div>
          <div class="ml-2 d-flex gap-1">
            <strong>Technology used:</strong>
            <div>{{ project.technologies.join(', ') }}</div>
          </div>
          <strong>Description:</strong>
          <p class="ms-2 description">
            {{ project.description }}
          </p>
        </h6>
      </div>
    </div>
  </div>
</template>


<style scoped lang="scss">
.description {
  white-space: pre-line;
}

.repository-link {
  overflow-wrap: anywhere;
}

@media print {
  .title {
    margin-top: 10px;
  }
}
</style>