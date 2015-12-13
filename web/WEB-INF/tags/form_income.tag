<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="col-sm-6">

    <h1>add income, bitch:</h1>

    <spring:url value="/addIncome" var="formUrl"/>

    <%--<form:form  method="POST" action="${formUrl}" modelAttribute="expense">--%>
    <form:form modelAttribute="income" action="${formUrl}" method="POST">

        <div class="form-group">
            <label for="income_category">Category:</label>
                <form:input path="category.name" cssClass="form-control" id="income_category" type="text"  placeholder="Category" aria-describedby="income_category"/>
            <%--<form:select path="category.name" items="${categoryOptions}" cssClass="selectpicker" id="category" type="text"  placeholder="Category" aria-describedby="category"/>--%>
        </div>

        <div class="form-group">
            <label for="income_amount">Amount:</label>
            <form:input path="income_amount" cssClass="form-control" id="income_amount" type="number"  placeholder="Amount" aria-describedby="income_amount"/>
        </div>


        <div class="form-group">
            <label for="income_date">Date:</label>
            <form:input path="income_date" cssClass="form-control" id="income_date" type="date" placeholder="Date" aria-describedby="income_date"/>
        </div>

        <button type="submit" class="btn btn-success">Submit</button>
        <%--<button type="button" class="btn btn-success" onclick="doAjaxPost()">Submit</button>--%>

    </form:form>


</div><%--col-sm-6--%>

