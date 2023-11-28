<script lang="ts">



import {RestAPI} from "../../services/RestAPI.ts";

export default {
  name: "IssueForm",
  data: function () {
    return {
      title: "" as string,
      name: ""as string,
      type: ""as string,
      names:[]as string[],
      explanation: "",
      check: false,
      handler: new RestAPI()
    }
  },
  async created(){
    if (this.names.length==0) this.names = await this.handler.asyncFetchNames()
  },
  methods: {
    async createIssue(event: Event) {
      event.preventDefault();
      if (this.title && this.name && this.type && this.explanation && this.explanation){
        const worry:Worry= {date:new Date(),title:this.title, name:this.name[0], type:this.type[0], explanation:this.explanation};
        await this.handler.asyncSave(worry);
      }
    }
  }
}

</script>

<template>
  <div class="container d-flex flex-column align-items-center">
    <form class="p-5 w-75 need-validation" novalidate @submit.stop="createIssue">
      <div class="form-group">
        <label for="exampleFormControlInput1">Title</label>
        <input required v-model.lazy="title" type="text" :class="'form-control'+(check&&!title?' border-danger':'')"
               id="exampleFormControlInput1" placeholder="Title">
      </div>
      <div class="form-group">
        <label for="exampleFormControlSelect1">Subject</label>
        <select required multiple v-model.lazy="name" :class="'form-control'+(check&&!name?' border-danger':'')"
                id="exampleFormControlSelect1">
          <option v-for="name in names">{{ name }}</option>
        </select>
      </div>
      <div class="form-group">
        <label for="exampleFormControlSelect2">Category</label>
        <select required multiple :class="'form-control'+(check&&!type?' border-danger':'')" v-model.lazy="type"
                id="exampleFormControlSelect2">
          <option>Violation</option>
          <option>Concern</option>
          <option>Hindrance</option>
        </select>
      </div>
      <div class="form-group">
        <label for="exampleFormControlTextarea1">Explanation</label>
        <textarea required v-model.lazy="explanation" :class="'form-control'+(check&&!explanation?' border-danger':'')"
                  id="exampleFormControlTextarea1" rows="3"></textarea>
      </div>
      <input type="submit" @click="check=true" class="btn btn-primary m-3" value="Create"/>
    </form>
  </div>
</template>

<style scoped lang="scss">

</style>