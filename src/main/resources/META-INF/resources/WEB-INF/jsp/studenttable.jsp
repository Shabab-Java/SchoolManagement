<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>
			<b>Student  Profile </b>
		</h1>
		<form action="<%= request.getContextPath() %>/student/id" method="get">
			<table style="with: 80%">
				 <%--  <cforEach var = "student" items = "${studentlist }"> --%>
				<tr>
					<td>First Name</td>
					<td>${student.firstName}</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td>${student.lastName}</td>
				</tr>
				<tr>
					<td>Father Name</td>
					<td>${student.fatherName}</td>
				</tr>
				<tr>
					<td>Roll Number</td>
					<td> ${student.rollNumber}</td>
				</tr>

				<tr>
					<td>Age</td>
					<td>${student.age }</td>
				</tr>
				<tr>
					<td>Sex</td>
					<td>${student.sex }</td>
					<!-- <td><input type="radio" name="sex" value="Male" />Male <input
						type="radio" name="sex" value="FeMale" />Female</td> -->
				</tr>

				<tr>
					<td>Address</td>
					<td>${student.address }</td>
				</tr>
				<tr>
					<td>Contact Number</td>
					<td>${student.contactNumber }</td>
				</tr>
				<tr>
					<td>Image</td>
					<td>${student.image}</td>
				</tr>
				<tr>
					<td>Email</td>
					<td>${student.email }</td>
				</tr>
				<tr>
					<td>User Id</td>
					<td>${student.userId }</td>
				</tr>

			</table>
			<input type="submit" value="Submit" />
			<td><input type="reset" value="Reset" /></td>
		</form>
	</div>
</body>

</html>