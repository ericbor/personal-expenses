<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
  <!-- Latest compiled and minified CSS -->
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <!-- jQuery library -->
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <!-- Latest compiled JavaScript -->
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <script src="<spring:url value="/resources/js/custom.js"/>"></script>

</head>
<body>

<div class="container">
  <div class="row">
    <div class="col-sm-6">

      <h1>fill form, bitch:</h1>

<div class="input-group">
  <span class="input-group-addon" >Category:</span>
  <input name="category" type="text" class="form-control" placeholder="Category" aria-describedby="category" id="category">
</div>

<div class="input-group">
  <span class="input-group-addon" >Amount:</span>
  <input type="text" class="form-control" placeholder="Amount" name="amount" aria-describedby="amount" id="amount">
</div>

      <div class="input-group">
        <span class="input-group-addon">Date:</span>
        <input name="date" type="text" class="form-control" placeholder="Date" aria-describedby="date" id="date">
      </div>

        <button type="button" class="btn btn-success" onclick="doAjaxPost()">Submit</button>

        <div id="info"></div>




    </div><%--row--%>
    </div><%--col-sm-6--%>
  </div><%--container--%>
</body>
</html>


