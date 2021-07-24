<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 90774
  Date: 2021/7/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>全部书籍展示页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <style>
        #add{
            margin-left: 15px;
        }
        #search{
            display: flex;
            flex-flow: row;
            justify-content: right;
        }
        #midRow{
            display: flex;
            flex-flow: row;
            justify-content: space-between;
            align-items: center;
        }
    </style>
</head>
<body>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>Blue的书架</small>
                </h1>
            </div>
        </div>

        <div class="row" id="midRow">
            <div id="add" class="column">
                <a class="btn btn-group-vertical btn-primary" href="${pageContext.request.contextPath}/books/toAddPage">添加图书</a>
            </div>
            <div class="column">
                <a class="btn btn-group-vertical btn-primary" href="${pageContext.request.contextPath}/books/selectAllBook">全部图书</a>
            </div>
            <div class="column" style="float: right">
                <form action="${pageContext.request.contextPath}/books/selectBook" method="post" id="search">
                    <input type="text" name="selectBookInfo" class="form-control" placeholder="请输入查询书籍的信息">
                    <input type="submit" value="查询" class="btn btn-primary">
                    <span style="color: red;width:113px">${error}</span>
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名称</th>
                    <th>书籍数量</th>
                    <th>书籍信息</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${list}">
                    <tr>
                        <td>${book.bookId}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/books/toUpdatePage?bookId=${book.bookId}">修改</a>
                            &nbsp;|&nbsp;
                            <a href="${pageContext.request.contextPath}/books/deleteBook/${book.bookId}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>

</div>

</body>
</html>
