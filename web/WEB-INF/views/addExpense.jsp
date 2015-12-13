
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="pages" uri="http://example.com/tags" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div class="container">
  <div class="row">

    <pages:form_expense />
    <pages:diagram />

  </div><%--row--%>
</div><%--container--%>



</body>
</html>
