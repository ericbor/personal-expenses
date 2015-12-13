<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="pages" uri="http://example.com/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title></title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div class="container">
  <div class="row">

    <pages:summary  />
    <pages:diagram />

  </div><%--row--%>
</div><%--container--%>



</body>
</html>
