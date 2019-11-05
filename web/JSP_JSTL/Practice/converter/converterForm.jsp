<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/5/2019
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
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
    <form action="converter.jsp" method="post">
        <label>Rate: </label><br/>
        <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
        <label>USD: </label><br/>
        <input type="text" name="usd" placeholder="USD" value="0"/><br/>
        <input type = "submit" id = "submit" value = "Converter"/>
    </form>
</body>
</html>
