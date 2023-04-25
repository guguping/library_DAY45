<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오전 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.bundle.min.js"></script>
    <title>detail</title>
</head>
<body>
    <h2>응애 나 애기 detail</h2>
<table class="table table-dark table-hover" style="text-align: center">
<tr>
    <th>번호</th>
    <th>제목</th>
    <th>출판사</th>
    <th>저자</th>
    <th>정가</th>
</tr>
    <tr>
        <td>${bookDTO.id}</td>
        <td>${bookDTO.bookName}</td>
        <th>${bookDTO.bookPublisher}</th>
        <th>${bookDTO.bookAuthor}</th>
        <th>${bookDTO.bookPrice}</th>
    </tr>
</table>
    <a href="/">인덱스로 이동</a>
</body>
</html>
