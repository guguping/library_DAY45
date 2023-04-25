<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오후 6:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script>
  const result = ${result};
  console.log(result);
  if (result >0){
    alert("삭제 완료");
    location.href = "/list";
  } else {
    alert("삭제도서가 없습니다");
    location.href = "/index";
  }
</script>
<head>
    <title>Title</title>
</head>
<body>
  <h2> 응애 </h2>
</body>
</html>
