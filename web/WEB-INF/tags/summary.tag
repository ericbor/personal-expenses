<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ attribute name="totalAllExpenses" required="false" %>
<%@ attribute name="totalAllIncomes" required="false" %>
<%@ attribute name="totalByCategory" required="false" %>

<div class="col-sm-6">
    <h3>Income: <span class="label label-default">${totalAllIncomes}</span></h3>
    <h3>Expenses: <span class="label label-default">${totalAllExpenses} </span></h3>

    <ul class="list-group">
    <c:forEach items="${totalByCategory}" var="item" varStatus="status">
        <li class="list-group-item">
            <span class="badge"> <c:out value="${item.value}"/></span>
            <c:out value="${item.key.name}"/>
        </li>
    </c:forEach>
    </ul>

    <h2>Balance: <span class="label label-default">
        <fmt:formatNumber type="number" maxFractionDigits="2" value="${totalAllIncomes - totalAllExpenses}" />
    </span></h2>

<a role="button" class="btn btn-info" href="<spring:url value="/addExpense"/>">Add Expense</a>
<a role="button" class="btn btn-info" href="<spring:url value="/addIncome"/>">Add Income</a>

</div>