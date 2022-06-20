<template>
  <div style="width: 75%; margin-left: auto; margin-right: auto">
    <div style="text-align: right">
      <a role="button" class="btn btn-primary bi bi-pencil-fill"> 글쓰기</a>
    </div>
    <table id="table" class="table table-horizontal" style="text-align: center">
      <thead id="thead">
        <tr>
          <th>번호</th>
          <th class="col-md-6 text-center">제목</th>
          <th>작성자</th>
          <th>작성일</th>
          <th>조회수</th>
        </tr>
      </thead>
      <tbody id="tbody">
        <tr>
          <td>id</td>
          <td>
            <a href="/posts/read/{{id}}">title </a>
          </td>
          <td>작성자</td>
          <td>작성일</td>
          <td>조회수</td>
        </tr>
      </tbody>
    </table>
    <div style="text-align: center">
      <pagination-comp></pagination-comp>
    </div>
  </div>
</template>

<script>
import PaginationComp from "@/components/post/PaginationComp";
export default {
  components: {
    PaginationComp,
  },
};
</script>

<style></style>
