<%@page import="com.dao.StudentDao"%>
<%@page import="com.bean.student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
<table border="1" width="100%" cellpadding="10px" cellsapcing="10px">
<tr>
	<th>ID</th>
	<th>FIRST NAME</th>
	<th>LAST NAME</th>
	<th>EMAIL</th>
	<th>MOBILE</th>
	<th>ADDRESS</th>
	<th>GENDER</th>
	<th>EDIT</th>
	<th>DELETE</th>

</tr>
<%
	List<student> list=StudentDao.getAllstudent();
	for(student s:list)
{
	%>
	<tr>
		<td><%=s.getId() %></td>
		<td><%=s.getFname() %></td>
		<td><%=s.getLname() %></td>
		<td><%=s.getEmail() %></td>
		<td><%=s.getMobile() %></td>
		<td><%=s.getAddress() %></td>
		<td><%=s.getGender() %></td>
		<td>
	<form name="edit" method="post" action="StudentController">
		<input type="hidden" name="id" value="<%=s.getId() %>">
		<input type="submit" name="action" value="EDIT" class="btn btn-primary">
	</form>
	</td>
		<td>
	<form name="edit" method="post" action="StudentController">
		<input type="hidden" name="id" value="<%=s.getId()%>">
		<input type="submit" name="action" value="DELETE" class="btn btn-danger">		
	</form>
	</td>
	</tr>
		
		<%
		}
		%>
</table>
<a href="index.jsp">Add New Student </a>
</body>
</html>