<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오후 2:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>saveResult</title>
    <script>
        const result = ${result};
        console.log(result);
        if (result >0){
            alert("신규 도서 등록 성공! List로 이동합니다!");
            location.href = "/list";
        } else {
            alert("문맹이 도서관에 있네 ?");
            location.href = "/save";
        }
    </script>
</head>
<body>
  <h2>응애 나 애기 saveResult</h2>
</body>
</html>
