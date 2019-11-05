<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/5/2019
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <style>
        input[type=text] {
            width: 300px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 4px;
            padding: 12px 10px 12px 10px;
        }
        #submit {
            border-radius: 2px;
            padding: 10px 32px;
            font-size: 16px;
        }
    </style>
</head>
<body>
    <h1>Calculator</h1>
    <form action="calculator.jsp" method="post">
        First operand: <input type="text" name="firstOperand"  placeholder=" First operand">
        Operator:
        <select name="operator">
            <option value="+" selected>Addition</option>
            <option value="-">subtraction</option>
            <option value="*">multiplication</option>
            <option value="/">division </option>
        </select>
        Second operand: <input type="text" name="secondOperand"  placeholder=" Second operand">
        <input type="submit" placeholder="calculate">
    </form>
</body>
</html>
