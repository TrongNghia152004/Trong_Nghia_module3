<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/2/2023
  Time: 12:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="../../css/bootstrap.css">
<body>

<h1 class="text-center">Quản lý sản phẩm</h1>
<p><a class="btn btn-primary"  href="/product?actionUser=create">Thêm mới</a></p>
<form action="/product" method="get">
    <table class="table">
        <tr>
            <th>id</th>
            <th>Tên sản phẩm</th>
            <th>Giá sản phẩm</th>
            <th>Mô tả sản phẩm</th>
            <th>Nhà sản xuất</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td>${product.idProduct}</td>
                <td>${product.nameProduct}</td>
                <td>${product.priceProduct}</td>
                <td>${product.describeProduct}</td>
                <td>${product.producer}</td>
            </tr>
        </c:forEach>
    </table>
</form>
<script src="../../js/bootstrap.js"></script>
</body>
</html>
