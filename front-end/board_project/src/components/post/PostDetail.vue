<template>
  <div>
    <form class="card">
      <div class="card-header d-flex justify-content-between">
        <label for="id">번호 : </label>
        <input type="hidden" id="id" value="{{posts.id}}" />
        <label for="createdDate"></label>
      </div>
      <div class="card-header d-flex justify-content-between">
        <label for="writer">작성자 : </label>
        <label for="view"><i class="bi bi-eye-fill"> </i></label>
      </div>
      <div class="card-body">
        <label for="title">제목</label>
        <input type="text" class="form-control" id="title" readonly />
        <br />
        <label for="content">내용</label>
        <textarea rows="5" class="form-control" id="content" readonly>
        </textarea>
      </div>
    </form>
  </div>
</template>

<script>
export default {};
</script>

<style></style>
