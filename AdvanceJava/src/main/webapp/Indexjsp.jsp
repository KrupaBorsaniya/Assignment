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
	<style type="text/css">
	tr,td{
	padding:10px;
	}
	</style>
	

</head>
<body>
<form name="insert" method="post" action="StudentController">
	<table>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile"></td>
		</tr>
		<tr>
			<td>Address</td>
			<td><textarea rows="5" cols="23" name="address"></textarea></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><input type="radio" name="gender" value="male">Male<br>
			<input type="radio" name="gender" value="female">Female</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="submit" name="action" value="Insert" class="btn btn-primary">
			</td>
		</tr>
	</table>
	
</form>
<a href="show.jsp">Show All Student </a>
</body>
</html>
