<%@page import="com.bean.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	integrity="undefined" crossorigin="anonymous">
<style type="text/css">
tr, td {
	padding: 7px;
}
</style>
</head>
<body>
<%
	Student s=(Student)request.getAttribute("s");
%>
	<form name="insert" method="post" action="StudentController">
		<table>
		<tr>
		<input type="hidden" name="id" value="<%=s.getId() %>">
		</tr>
		
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" value="<%=s.getFname() %>"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" value="<%=s.getLname() %>"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" value="<%=s.getEmail() %>"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" value="<%=s.getMobile() %>"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea rows="5" cols="18" name="address"><%=s.getAddress() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"name="action" value="Update" class="btn-btn-primary"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>