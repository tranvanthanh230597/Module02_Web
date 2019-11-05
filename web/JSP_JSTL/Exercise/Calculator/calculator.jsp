<%--
  Created by IntelliJ IDEA.
  User: tranv
  Date: 11/5/2019
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <%
        float firstOperand = Float.parseFloat(request.getParameter("firstOperand"));
        float secondOperand = Float.parseFloat(request.getParameter("secondOperand"));
        String operator = request.getParameter("operator");
        float result = 0;
        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                result = firstOperand / secondOperand;
                break;
        }
    %>

    <h1>firstOperand: <%=firstOperand%></h1>
    <h1>secondOperand: <%=secondOperand%></h1>
    <h1>operator: <%=operator%></h1>
    <h1>result: <%=result%></h1>

</body>
</html>
