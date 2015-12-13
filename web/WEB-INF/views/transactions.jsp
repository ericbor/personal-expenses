<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<table class="table table-hover">
    <tbody>
    <tr>
        <th>Category</th><th>Amount</th><th>Date</th>
    </tr>
    <c:forEach items="${expenses}" var="expense">
        <tr>
            <td>${expense.category.name}</td>
            <td>${expense.amount}</td>
            <td>${expense.date}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>