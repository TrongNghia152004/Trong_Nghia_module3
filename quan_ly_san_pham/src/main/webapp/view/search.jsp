<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/2/2023
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="/css/bootstrap.css">
<body>
<table class="table">
    <tr>
        <th>Id</th>
        <th>Tên sản phẩm</th>
        <th>Giá sản phẩm</th>
        <th>Chi tiết sản phẩm</th>
        <th>Nhà sản xuất</th>
    </tr>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.describe}</td>
            <td>${product.producer}</td>
            <td><a href="/product?actionUser=update&id=${product.id}" class="btn btn-primary">Sửa</a></td>
            <td><a href="/product?actionUser=delete&id=${product.id}" class="btn btn-danger">Xoá</a></td>
        </tr>
    </c:forEach>
</table>
<script src="/js/bootstrap.js"></script>
</body>
</html>
