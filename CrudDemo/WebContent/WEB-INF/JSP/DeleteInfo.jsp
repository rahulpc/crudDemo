<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="deleteRecord.html" commandName="register"><center>
<br><br><br><br><br>


<table border="1">
<tr><td>Enter Id :</td>
<td> <s:input type="text" name="empId" path="empId" /></td></tr>

</table><br><br>
<input type="submit" name="DeleteB" value="Delete ">
<br>
</center>
</s:form>
</body>
</html>