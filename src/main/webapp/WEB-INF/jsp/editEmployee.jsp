<%--
  Created by IntelliJ IDEA.
  User: raju
  Date: 23/5/16
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
</head>
<body>
<form:form action="/employees/update" method="POST" modelAttribute="employee">
  <form:input type="hidden" path="id"/>
  Name: <form:input type="text" path="name" name="name"/><br/>
  Email: <form:input type="email" path="email" name="email"/><br/>
  Gender: <form:select name="gender" path="gender">
  <option value="Male">Male</option>
  <option value="FeMale">FeMale</option>
  <option value="Other">Other</option>
</form:select><br/>
  <input type="submit" value="Update">
</form:form>
</body>
</html>
