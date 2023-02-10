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
            <td><label>Operator</label></td>
            <td><select name="operator" id="operator">
                <option value="Addition">Addition</option>
                <option value="Subtraction">Subtraction</option>
                <option value="Multiplication">Multiplication</option>
                <option value="Division">Division</option>
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
