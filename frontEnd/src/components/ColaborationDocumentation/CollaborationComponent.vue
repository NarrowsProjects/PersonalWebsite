<script lang="ts">
import {RestAPI} from "../../services/RestAPI";
export default{
  name: "CollaborationComponent",
  data() {
    return {
      handler: new RestAPI()
    }
  },
  provide(){
    return{
      handler: this.handler
    }
  }
}

</script>

<template>
  <div class="container">
    <div class="row">
      <router-link class="col-6 text-center p-3 bg-dark-subtle btn btn-dark" to="/collaboration/table">View entries</router-link>
      <router-link class="col-6 text-center p-3 bg-dark-subtle btn btn-dark" to="/collaboration/issueForm">Add new entry</router-link>
    </div>
  </div>

  <router-view></router-view>
</template>

<style scoped lang="scss">
.router-link-active{
  background-color: #4b4b4b !important;
}
</style>