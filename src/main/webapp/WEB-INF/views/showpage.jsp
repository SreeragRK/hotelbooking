<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<center>
<h1><center> Welcome to HotelBooking </center></h1>
<form:form method="POST" action="/billdesk" modelAttribute="hotel">

<table>
<tr>
<td><label>Choose Room Type</label></td>
<td><form:select path="roomType" id="roomType" items="${roomList}"></form:select></td>
</tr>
<tr>
<td><label>Enter Number Of Days</label></td>
<td><form:input path="noOfDays" id="noOfDays"/></td>
<form:errors path="noOfDays"></form:errors>
</tr>
<tr>
<center>
<input type="submit" value="TotalCost" name="submit">
</center>
</tr>
</table>
              
	
</form:form>

</center>
</body>
</html>	 	  	 