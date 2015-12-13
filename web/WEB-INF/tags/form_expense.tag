<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="col-sm-6">

    <h1>fill form, bitch:</h1>

    <spring:url value="/addExpense" var="formUrl"/>

    <%--<form:form  method="POST" action="${formUrl}" modelAttribute="expense">--%>
    <form:form modelAttribute="expense" action="${formUrl}" method="POST">

    <div class="form-group">
        <label for="category">Choose Category:</label>
            <%--<form:input path="category.name" cssClass="form-control" id="category" type="text"  placeholder="Category" aria-describedby="category"/>--%>
        <form:select path="category.name" items="${categoryOptions}" cssClass="selectpicker" id="category" type="text"  placeholder="Category" aria-describedby="category"/>
    </div>

<button type="button" class="btn btn-default" data-toggle="modal" data-target="#addCategoryModal">Add new category</button>



    <div class="form-group">
        <label for="amount">Amount:</label>
        <form:input path="amount" cssClass="form-control" id="amount" type="number"  placeholder="Amount" aria-describedby="amount"/>
    </div>


    <div class="form-group">
        <label for="date">Date:</label>
        <form:input path="date" cssClass="form-control" id="date" type="date" placeholder="Date" aria-describedby="date"/>
    </div>

        <%--<button type="submit" class="btn btn-success">Submit</button>--%>
        <button type="button" class="btn btn-success" onclick="doAjaxPost()">Submit</button>

    </form:form>


</div><%--col-sm-6--%>

<!-- Modal -->
<div id="addCategoryModal" class="modal fade" role="dialog">
    <div class="modal-dialog">

        <!-- Modal content-->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4 class="modal-title">Give it a name</h4>
            </div>

            <div class="modal-body">
                <div class="form-group">
                    <form:input path="date" cssClass="form-control" id="addCategory" type="text" placeholder="new category name" aria-describedby="addCategory"/>
                </div>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
        </div>

    </div>
</div>