<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/5/2019
  Time: 2:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Customer</title>
</head>
<body>
    <h1>Delete customer</h1>
    <p>
        <a href="/customers">Back to customer list</a>
    </p>
    <form method="post">
        <h3>Are you sure?</h3>
        <fieldset>
            <legend>Customer information</legend>
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
                <tr>
                    <td><input type="submit" value="Delete customer"></td>
                    <td><a href="/customers">Back to customer list</a></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
