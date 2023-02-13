<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 13/2/2023
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <form method="post">
        <div>
            <label for="idProduct">Id sản phẩm</label>
            <input type="text" name="idProduct" id="idProduct">
        </div>
        <div>
            <label for="nameProduct">Tên sản phẩm</label>
            <input type="text" name="nameProduct" id="nameProduct">
        </div>
        <div>
            <label for="priceProduct">Giá sản phẩm</label>
            <input type="text" name="priceProduct" id="priceProduct">
        </div>
        <div>
            <label for="describeProduct">Mô tả sản phẩm</label>
            <input type="text" name="describeProduct" id="describeProduct">
        </div>
        <div>
            <label for="producer">Nhà sản xuất</label>
            <input type="text" name="producer" id="producer">
        </div>
        <input class="btn btn-primary" type="submit" value="Lưu">
    </form>
</div>
</body>
</html>
