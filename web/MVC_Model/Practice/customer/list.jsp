<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/5/2019
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
    <h1>Customers</h1>
    <p>
        <a href="/customers?action=create">Create new customer</a>
    </p>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
            <td>Edit</td>
            <td>Delete</td>
        </tr>

        <c:forEach items="${requestScope['ListCustomer']}" var="customer">
            <tr>
                <td>${customer.getID()}</td>
                <td><a href="/customers?action=view&ID=${customer.getID()}">${customer.getName()}</a></td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getAddress()}</td>
                <td><a href="/customers?action=edit&ID=${customer.getID()}">edit</a></td>
                <td><a href="/customers?action=delete&ID=${customer.getID()}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
