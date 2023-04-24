<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-24
  Time: 오전 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/monday1">monday1 링크</a>
    <button onclick="fun1()">monday2 버튼</button>
    <button onclick="fun2()">monday3 버튼</button>
    <button onclick="fun3()">monday4 버튼</button>
    <a href="/monday5">monday5</a>
    <a href="/method1">method1 호출</a>
<%-- monday6.jsp: 회원 이메일 비밀번호 성별 전화번호 사는지역 개발가능한 언어 정보를 입력받고
    이 정보를 DTO 객체에 담아서 Service 클래스의 method2에서 Sysout으로 출력해볼 것--%>
    <a href="/monday6">monday6.jsp</a>
</body>
    <script>
        fun1 = () => {
            location.href = "/monday2";
        }
        fun2 = () => {
            location.href = "/monday3";
        }
        fun3 = () => {
            location.href = "/monday4";
        }
    </script>
</html>
