<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="col-sm-6">

    <h1>fill form, bitch:</h1>

        <spring:url value="/addExpense" var="formUrl"/>

       <%--<form:form  method="POST" action="${formUrl}" modelAttribute="expense">--%>
    <form:form modelAttribute="expense">

    <div class="input-group">
        <span class="input-group-addon" >Category:</span>
        <%--<input name="category" type="text" class="form-control" placeholder="Category" aria-describedby="category" id="category">--%>
        <form:input path="category" cssClass="form-control" id="category" type="text"  placeholder="Category" aria-describedby="category"/>
    </div>

    <div class="input-group">
        <span class="input-group-addon" >Amount:</span>
        <form:input path="amount" cssClass="form-control" id="amount" type="number"  placeholder="Amount" aria-describedby="amount"/>
    </div>


    <div class="input-group">
        <span class="input-group-addon">Date:</span>
        <form:input path="date" cssClass="form-control" id="date" type="date" placeholder="Date" aria-describedby="date"/>
    </div>

        <%--<button type="submit" class="btn btn-success">Submit</button>--%>
        <button type="button" class="btn btn-success" onclick="doAjaxPost()">Submit</button>
    </form:form>


</div><%--col-sm-6--%>

