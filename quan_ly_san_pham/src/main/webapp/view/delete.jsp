<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/2/2023
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    <h1>Xóa thông tin của sản phẩm ${product.name}</h1>
    <table class="table">
        <tr>
            <th>Name</th>
            <td>${product.name}</td>
        </tr>
        <tr>
            <th>Price</th>
            <td>${product.price}</td>
        </tr>
        <tr>
            <th>Describe</th>
            <td>${product.describe}</td>
        </tr>
        <tr>
            <th>Producer</th>
            <td>${product.producer}</td>
        </tr>
    </table>
    <input type="submit" value="Xoá nè">
</form>
</body>
</html>