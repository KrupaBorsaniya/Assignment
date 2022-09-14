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
	span
	{
		color:red;
	}
	</style>
<script src="js/Validation.js">
	
		
	
</script>
</head>
<body>
	<form name="index" method="get" action=" ">
		<table cellpadding="5px" cellspacing="5px">
			<tr>
				<td>First name</td>
				<td><input type="text" name="fname" placeholder="First Name" onblur="checkFname();"></td>
				<td><span id="fname"></span></td>
				
			</tr>
			<tr>
				<td>Last name</td>
				<td><input type="text" name="lname" placeholder="Last Name" onblur="checkLname();"></td>
				<td><span id="lname"></span></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><input type="text" name="email" placeholder="Email" onblur="Email();"></td>
				<td><span id="email"></span></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" name="mobile" placeholder="Mobile" onblur="Mobile();"></td>
				<td><span id="mobile"></span></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><textarea rows="5" cols="20" name="address" placeholder="Address"></textarea></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="male">Male<br>
					<input type="radio" name="gender" value="female">Female
			</tr>
			<tr>
				<td>Hobby</td>
				<td><input type="checkbox" name="hobby" value="music">Music<br>
					<input type="checkbox" name="hobby" value="reading">Reading<br>
					<input type="checkbox" name="hobby" value="traveling">Traveling<br>
					<input type="checkbox" name="hobby" value="cricket">Cricket<br>
					<input type="checkbox" name="hobby" value="watching tv">Watching TV
			</tr>
			<tr>
				<td>Education</td>
				<td><select name="education">
						<option>----Select Education----</option>
						<option value="10th">10th</option>
						<option value="12th">12th</option>
						<option value="Diploma">Diploma</option>
						<option value="BE">BE</option>
						<option value="B.Tech">B.Tech</option>
						<option value="ME">ME</option>
						<option value="M.Tech">M.Tech</option>
						<option value="BCA">BCA</option>
						<option value="MCA">MCA</option>
						<option value="BSC">BSC</option>
						<option value="MSC">MSC</option>
						<option value="B.com">B.com</option>
						<option value="M.com">M.com</option>

				</select></td>
			</tr>
			<tr>
				<td>Resume</td>
				<td><input type="file" name="resume"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="passeword" placeholder="Password"></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name=" cpassword" placeholder="Confirm Password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name="action" value="SUBMIT">
			</tr>

		</table>
	</form>
</body>
</html>