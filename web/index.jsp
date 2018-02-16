<%--
  Created by IntelliJ IDEA.
  User: heshmat
  Date: 2/8/2018
  Time: 7:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>transparent Login Form</title>
    <link rel="stylesheet" href="style.css">

</head>
<body>

<div class="loginBox">
   <img src="adminIcon.jpg" class="user">
    <h2>Log In</h2>
    <form method="post" action="login">
        <p>Email</p>
        <input type="text" name="email" placeholder="Enter Username">
        <p>Password</p>
        <input type="password" name="pass" placeholder="••••••">
        <input type="submit" name="" value="Sign In">
        <a href="#">Forget Password</a>
    </form>
</div>
</body>
</html>