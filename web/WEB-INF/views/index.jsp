<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="pages" uri="http://example.com/tags" %>

<html>
<head>
    <title>Personal Expenses</title>


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

    <pages:form />
    <pages:diagram />

    </div><%--row--%>
  </div><%--container--%>
</body>
</html>


