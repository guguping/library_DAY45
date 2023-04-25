<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오전 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save</title>
</head>
<body>
  <h2>응애 나 애기 save</h2>
  <form action="/save" method="post">
    <label for="bookName">제목</label><br>
    <input type="text" name="bookName" id="bookName"><br>
    <label for="bookPublisher">출판사</label><br>
    <input type="text" name="bookPublisher" id="bookPublisher"><br>
    <label for="bookAuthor">저자</label><br>
    <input type="text" name="bookAuthor" id="bookAuthor"><br>
    <label for="bookPrice">정가</label><br>
    <input type="text" name="bookPrice" id="bookPrice"><br>
    <button>등록</button>
  </form>
  <a href="/">인덱스로 이동</a>
</body>
</html>
