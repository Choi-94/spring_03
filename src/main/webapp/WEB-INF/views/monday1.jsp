<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오전 9:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <button onclick="param1()">monday1파라미터 전송</button>
</body>
<script>
    param1 = () => {
        const month = "4월";
        const day = "24일";
        location.href = "/monday1-param?month="+month+"&day"+day;
    }
</script>
</html>
