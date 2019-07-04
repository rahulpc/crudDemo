<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to CrudDemo</title>
</head>
<body>
<s:form action="Registration.html" commandName="register"><center>
<br><br><br><br><br>


<table border="1">
<tr><td>Enter Id :</td>
<td> <s:input type="hidden" name="empId" path="empId" /></td></tr>
<tr> <td>Enter Name :</td>
<td><s:input type="text" name="empName" path="empName" placeholder="Enter emp Name "/><br></td></tr>
 <tr><td>Enter Address :</td>
 <td><s:input type="text" name="empAddress" path="empAddress" placeholder="Enter Address" /></td><tr>
 <tr><td>Enter Salary  :</td>
 <td><s:input type="text" name="empSalary" path="empSalary" /></td></tr>
  
</table><br><br>
<input type="submit" name="insert" value="Register">
<br>
</center>
</s:form>

<center><br><br>
<table border="2">
<tr><th>Employee ID</th><th>Employee Name</th><th>Employee Address</th><th>Employee Salary</th><th>Action</th><th>Action</th></tr>
 <c:forEach var="v" items="${list}">
<tr><td>${v.empId}</td><td>${v.empName}</td><td>${v.empAddress}</td><td>${v.empSalary}</td><td><a href="edit.html">Edit</td><td><a href="delete.html">Delete</td></tr>
</c:forEach> 
</table></center>
</body>
</html>