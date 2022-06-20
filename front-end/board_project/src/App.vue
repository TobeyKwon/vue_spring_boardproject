<template>
  <header-nav></header-nav>
  <table-view></table-view>
</template>

<script>
import HeaderNav from "@/components/HeaderNav.vue";
import TableView from "@/components/TableView.vue";

export default {
  name: "App",
  components: {
    HeaderNav,
    TableView,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
}
</style>
