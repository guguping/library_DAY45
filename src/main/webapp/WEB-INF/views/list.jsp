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
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <h2>응애 나 애기 list</h2>
    <table class="table table-dark table-hover" style="text-align: center">
        <tr>
            <th>번호</th>
            <th>제목</th>
<%--            <th>출판사</th>--%>
<%--            <th>저자</th>--%>
<%--            <th>정가</th>--%>
            <th>조회</th>
        </tr>
        <c:forEach items="${bookDTOList}" var="s">
        <tr>
            <td>${s.id}</td>
            <td>${s.bookName}</td>
<%--            <th>${s.bookPublisher}</th>--%>
<%--            <th>${s.bookAuthor}</th>--%>
<%--            <th>${s.bookPrice}</th>--%>
<%--            상세조회를 위한 요청주소: detail
                같이 보내줘야 하는 값: id
                detail 요청을 처리하는 컨트롤러 메서드를 만들고
                조회결과를 detail.jsp에 출력하자
                BookRepositroy에서는 sql.selectOne()을 사용하고
                mapper에서는 parameterType="Long"으로 주고
                resultType="book"으로 하면 됩니다--%>
            <td><a href="/detail?id=${s.id}">조회</a></td>
        </tr>
        </c:forEach>
    </table>
    <a href="/">인덱스로 이동</a>
</body>
</html>
