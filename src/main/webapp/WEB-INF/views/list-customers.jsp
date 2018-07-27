<%--
  Created by IntelliJ IDEA.
  User: Konrad
  Date: 27.07.2018
  Time: 09:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/webjars/bootstrap/4.0.0-2/css/bootstrap.css" type="text/css"
          rel="stylesheet">
</head>
<body>
<div class="container mt-4">
    <form action="/" method="post">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>First Name</th>
                <th>Last name</th>
                <th>Email</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="customer" items="${customers}" varStatus="loop">
                <tr>
                    <th scope="row">${loop.index + 1}</th>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>

                    <td><input class="form-check-input" type="radio" name="customerId" value="${customer.id}" checked>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="addCustomer"><input type="button" class="btn btn-outline-success" name="action" value="ADD"></a>
        <input type="submit" class="btn btn-outline-danger" name="action" value="DELETE">
    </form>
</div>
</body>
</html>