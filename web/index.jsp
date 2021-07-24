<%--
  Created by IntelliJ IDEA.
  User: blue
  Date: 2021/7/24
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      body{
        display:flex;
        flex-flow: column;
        align-items: center;
        justify-content: center;
      }
      a{
        text-decoration-line: none;
        color: white;
        cursor: pointer;
        user-select: none;
      }
      h3{
        background-color: skyblue;
        border-radius: 5px;
        padding: 10px;
        user-select: none;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/books/">进入书籍页面</a>
  </h3>
  </body>
</html>
