<%--
  Created by IntelliJ IDEA.
  User: heshmat
  Date: 2/15/2018
  Time: 1:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
    <meta charset="utf-8">
    <title>transparent Login Form</title>
    <link rel="stylesheet" href="style2.css">
    </head>
    <img src="admin3.png" class="user">
    <style>

        ul {

            list-style-type: none;
            margin: 0;
            padding: 20px;
            width: 150px;
            height: 150px;
            transform: translate(280%,50%);
            background:rgba(0,0,0,.5);
       }

        li a {
            display: block;
            color: #000;
            padding: 8px 16px;
            text-decoration: none;

        }

        li a.active {
            background-color: rgba(0,0,0,.5);
            color:  #ff267e;
            font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif;
            font-weight: bolder;
        }

        li a:hover:not(.active) {
            background-color:rgba(0,0,0,.5);
            color: rgba(255,255,255,.5);
        }
    </style>


</head>
<body>



<ul>

    <li><a class="active" href="AdminDashboard.jsp">Home </a></li>
    <pre></pre>
    <li><a href="Registration.jsp">Add users</a></li>
    <li><a href="contact.jsp">Contact</a></li>
    <pre></pre>
    <pre></pre>
    <pre></pre>
    <pre></pre>
    <pre></pre>
    <pre></pre>
    <pre></pre>
    <pre></pre>
    <pre></pre>

    <li><a href="index.jsp">Logout</a></li>
</ul>


</body>

</html>
