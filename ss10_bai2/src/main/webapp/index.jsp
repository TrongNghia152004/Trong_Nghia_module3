<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2023
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
</style>
<link rel="stylesheet" href="css/bootstrap.css">
<body>
<form action="/calculator" method="get">
    <h1>Simple Calculator</h1>
    <table>
        <tr>
            <th>Calculator</th>
            <th></th>
        </tr>
        <tr>
            <td><label for="firstNumber"></label>First operand
            </td>
            <td><input type="text" name="firstNumber" id="firstNumber">
            </td>
        </tr>
        <tr>
            <td></td>
            <td><select name="operator" id="operator">
                <option value="Cong">Addition</option>
                <option value="Tru">Subtraction</option>
                <option value="Nhan">Multiplication</option>
                <option value="Chia">Division</option>
            </select></td>
        </tr>
        <tr>
            <td>
                <label for="secondNumber"></label>First operand
            </td>
            <td>
                <input type="text" name="secondNumber" id="secondNumber">

            </td>
        </tr>
    </table>
    <input class="btn btn-primary" type="submit" value="Calculate">
</form>
<script src="js/bootstrap.js"></script>
</body>
</html>
