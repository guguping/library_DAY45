<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-26
  Time: 오전 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
<form action="/update" method="post">
  <input type="text" name="id" value="${bookUpdate.id}" readonly><br>
  <label for="bookName">제목</label><br>
  <input type="text" name="bookName" id="bookName" value="${bookUpdate.bookName}"><br>
  <label for="bookPublisher">출판사</label><br>
  <input type="text" name="bookPublisher" id="bookPublisher" value="${bookUpdate.bookPublisher}"><br>
  <label for="bookAuthor">저자</label><br>
  <input type="text" name="bookAuthor" id="bookAuthor" value="${bookUpdate.bookAuthor}"><br>
  <label for="bookPrice">정가</label><br>
  <input type="text" name="bookPrice" id="bookPrice" value="${bookUpdate.bookPrice}"><br>
  <button>등록</button>
</form>
<a href="/">인덱스로 이동</a>
</body>
</html>
