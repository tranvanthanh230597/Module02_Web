<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/3/2019
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
    <h2>Product Discount Calculator</h2>
    <form action="/discount" method="post">
        Product Description: <input type="text" name="description" placeholder="Enter your Product Description "><br>
        List Price: <input type="text" name="price" placeholder="Enter your List Price " ><br>
        Discount Percent: <input type="text" name="discount" placeholder="Enter your List Discount Percent ">
        <input type="submit" value="calculate">
    </form>
</body>
</html>
