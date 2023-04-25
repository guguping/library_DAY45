<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>list</title>
</head>
<body>
    <h2>응애 나 애기 list</h2>
    <table>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>출판사</th>
            <th>저자</th>
            <th>정가</th>
        </tr>
        <c:forEach items="bookDTOList" var="s">
        <tr>
            <th>s.id</th>
            <th>s.bookName</th>
            <th>s.bookPublisher</th>
            <th>s.bookAuthor</th>
            <th>s.bookPrice</th>
        </tr>
        </c:forEach>
    </table>
    <a href="/">인덱스로 이동</a>
</body>
</html>
