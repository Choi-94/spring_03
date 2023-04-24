<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오전 9:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<script src="/resources/js/bootstrap.bundle.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<style>
    #table1{
        width: 70%;
        text-align: center;
        solid-color: #0dcaf0;
        margin: 15%;
    }
</style>
<body>
<table class="table table-dark table-hover" id="table1">
    <c:forEach items="${memberList}" var="m">
    <tr>
        <td>월:${m.month}</td>
        <td>일:${m.day}</td>
        <td>이름:${m.name}</td>
        <td>핸드폰:${m.mobile}</td>
        <td>이메일:${m.email}</td>
        <td>비밀번호:${m.password}</td>
    </tr>
    </c:forEach>

</body>
</html>
