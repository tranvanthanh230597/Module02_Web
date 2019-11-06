<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/5/2019
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>View Customer</title>
</head>
<body>
    <h1>Customer details</h1>
    <p>
        <a href="/customers">Back to customer list</a>
    </p>
    <table>
        <tr>
            <td>Name: </td>
            <td>${requestScope["customerInfo"].getName()}</td>
        </tr>
        <tr>
            <td>Email: </td>
            <td>${requestScope["customerInfo"].getEmail()}</td>
        </tr>
        <tr>
            <td>Address: </td>
            <td>${requestScope["customerInfo"].getAddress()}</td>
        </tr>
    </table>
</body>
</html>
