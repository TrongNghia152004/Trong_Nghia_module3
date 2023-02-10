<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2023
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        th , td{
            font-weight: bolder;
        }
    </style>
</head>
<link rel="stylesheet" href="css/bootstrap.css">
<body>
<h1 class="text-center">Danh sách khách hàng</h1>
<table class="table">
    <thead>
    <tr>
        <th>Tên</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.dateOfBirth}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.img}" alt="" width="150px" height="200px"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script scr="js/bootstrap.js"></script>
</body>
</html>
