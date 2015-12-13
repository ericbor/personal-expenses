<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div>Category: ${expense.category.name}</div>
<div>Amount: ${expense.amount}</div>
<div>Date: ${expense.date}</div>

</body>
</html>
