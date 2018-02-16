<%--
  Created by IntelliJ IDEA.
  User: heshmat
  Date: 2/9/2018
  Time: 10:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>

    <title>login form</title>
</head>
<body style="background-color:rgba(26,87,219,0.8);">
<a href="${pageContext.request.contextPath}/AddUsers">Login</a>
<form method="POST" action="/InsertingData">
    <p>Enter Name :
        <input type="text"  name="username" size="20"></p>
    <p>Enter Password :
        <input type="password" name="password" size="20"></p>
    <input type="submit" value="Submit" name="B1"></p>
</form>
</body>
</html>