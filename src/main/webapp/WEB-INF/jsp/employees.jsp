<%--
  Created by IntelliJ IDEA.
  User: raju
  Date: 23/5/16
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
</head>
<body>
<a href="/"><h1>Emplpoyees Page</h1></a>
<c:if test="${message!=null}">
  <p style="color: green">${message}</p>
</c:if>
<table>
  <tr>
    <td>Id</td>
    <td>Name</td>
    <td>Email</td>
    <td>Gender</td>
    <td>Action</td>
  </tr>
  <c:forEach var="employee" items="${employees}">
    <tr>
      <td>${employee.id}</td>
      <td>${employee.name}</td>
      <td>${employee.email}</td>
      <td>${employee.gender}</td>
      <td><a href="/employees/${employee.id}">Edit</a> &nbsp;
        <a href="/employees/${employee.id}/delete">Delete</a></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
