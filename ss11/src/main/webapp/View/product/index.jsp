<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/2/2023
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <title>Title</title>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <link rel="stylesheet" href="../../css/bootstrap.css">
</head>
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
<%--<a href="/product">Quản lý sản phẩm</a>--%>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
