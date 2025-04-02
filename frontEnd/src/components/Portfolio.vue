<template>
  <main class="py-4">
    <div class="container">
    <div class="row">
      <div class="col-xl-8">
        <h1>My Projects</h1>
        <div class="card mb-4">
          <div class="card-body">
            <h2 class="card-title">Database Energy Benchmark Suite <span class="badge bg-primary">Rust</span></h2>
            <p class="card-text">
              A Rust high-performance benchmarking tool measuring energy efficiency differences between 
              MongoDB and PostgreSQL when handling hierarchical data operations. 
            </p>

            <h5>Key Features:</h5>
            <ul class="list-group list-group-flush mb-3">
              <li class="list-group-item">
                🔋Comparative energy analysis with Intel PCM monitoring
              </li>
              <li class="list-group-item">
                ⚡JSON testdata generation (3/5/10 nesting levels)
              </li>
              <li class="list-group-item">
                🔄 Workload simulations (5:1 and 1:5 read/write ratios)
              </li>
              <li class="list-group-item">
                📁 CSV output for detailed energy consumption metrics
              </li>
            </ul>

            <a href="https://github.com/NarrowsProjects/database-energy-benchmarker" 
              class="btn btn-outline-primary" 
              target="_blank">
              View on GitHub
            </a>
          </div>
        </div>
      </div>
    </div>
  </div>
    <div class="px-4 my-5 text-center border-bottom">
      <div class="col-lg-6 mx-auto">
        <p class="lead mb-4">        </p>
        <div class="d-grid gap-2 d-sm-flex justify-content-sm-center mb-5">

        </div>
      </div>
      <div class="overflow-hidden" style="max-height: 30vh;">
        <div class="container px-5">

        </div>
      </div>
    </div>
  </main>
</template>

<script lang="ts">
import Sidebar from '@/Sidebar.vue'

export default {
  name: 'Portfolio',
  components: {Sidebar}
}
</script>

<style lang="scss" scoped>
.cover-image {
  width: 700px;
}
</style>