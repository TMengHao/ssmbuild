<%--
  Created by IntelliJ IDEA.
  User: 90774
  Date: 2021/7/24
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍页面</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/books/updateBook" method="post">

        <%--配置隐藏域获得id--%>
        <input type="hidden" name="bookId" value="${SELBook.bookId}">

        <div class="form-group">
            <label for="bookName">书籍名称：</label>
            <input name="bookName" type="text" class="form-control" id="bookName" value="${SELBook.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bookCounts">书籍数量：</label>
            <input name="bookCounts" type="text" class="form-control" id="bookCounts" value="${SELBook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="bookDetail">书籍详情：</label>
            <input name="detail" type="text" class="form-control" id="bookDetail" value="${SELBook.detail}" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>
    </form>

</div>
</body>
</html>