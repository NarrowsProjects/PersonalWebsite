<script lang="ts">
import {RestAPI} from "../../services/RestAPI.ts";
import number = CSS.number;

export default{
  name: "IssueTable",
  insert:["handler"],
  data() {
   return {
     name:"-",
     type:"-",
     worries:[] as Worry[]|null,
     handler: new RestAPI(),
     amount:0 as number|undefined
   }
  },
async created(){
    if (this.worries?.length===0) this.worries= await this.handler.asyncFindAll();
}
,methods: {
    number,
   async fetchIssues(event:Event){
      event.preventDefault();
      if (this.name!=="-" && this.type!=="-" ) this.worries=await this.handler.asyncFindByNameAndType(this.name,this.type);
      else if (this.name!=="-" ) this.worries=await this.handler.asyncFindByName(this.name);
      else if (this.type!=="-" ) this.worries=await this.handler.asyncFindByType(this.type);
      else this.worries= await this.handler.asyncFindAll();
    }

  },
  watch:{
    worries(){
      this.amount=this.worries?.length
    }
  }
}

</script>

<template>
  <br/>
  <div class="container d-flex flex-column align-items-center">
    <form class="p-5 w-75" @submit="fetchIssues">
      <div class="form-group">
        <label for="exampleFormControlSelect1">Subject</label>
        <select v-model="name" class="form-control" id="exampleFormControlSelect1">
          <option selected >-</option>
          <option>Mourad</option>
          <option>Mohammed(L)</option>
          <option>Mohamed(E)</option>
          <option>Guust</option>
        </select>
      </div>
      <div class="form-group">
        <label for="exampleFormControlSelect2">Category</label>
        <select v-model="type" class="form-control" id="exampleFormControlSelect2">
          <option>-</option>
          <option>Violation</option>
          <option>Concern</option>
          <option>Hindrance</option>
        </select>
      </div>
      <input type="submit" class="btn btn-primary m-3" value="Find" />
    </form>
  </div>
  <div class="container d-flex justify-content-center">
    <div  class="col-10">
      <table class="table">
        <thead class="thead-dark">
        <h1>{{ amount }}</h1>
        <tr>
          <th style="width:20%" scope="col">Type</th>
          <th style="width:20%" scope="col">Name</th>
          <th style="width:60%" scope="col">Description</th>
        </tr>
        </thead>
        <tbody>
        <tr v-for="(worry,index) in worries" :key="index">
          <td  style="width:20%" >{{ worry.title }}</td>
          <td  style="width:20%" >{{ worry.name }}</td>
          <td  style="width:60%" >{{'Title: '+ worry.type }} <br>  {{('Date: '+ worry.date).slice(0,-19) }}  <br> {{ worry.explanation }}</td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>
<br>
<br>
<br>
</template>

<style scoped lang="scss">

</style>