<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1> Students Table</h1>
		<%-- <form action="<%= request.getContextPath() %>/getStudent" method="get"> --%>
			<table style="with: 80%">
			
			

		<table class="table table-striped">
			<thead>
				<tr>
					<th>ID</th>
					<th>FirstName</th>
					<th>LastName</th>
					<th>FatherName</th>
					<th>RollNumber</th>
					<th>Age</th>
					<th>Sex</th>
					<th>Address</th>
					<th>ContactNumber</th>
					<th>Image</th>
					<th>Email</th>
					<th>UserId</th>
				</tr>
			</thead>
		<tbody>
        <c:forEach var = "student" items = "${studentlist }">
				<tr>
				    <td>${student.id}</td>
					<td>${student.firstName}</td>
					<td>${student.lastName}</td>
					<td>${student.fatherName}</td>
					<td> ${student.rollNumber}</td>
					<td>${student.age }</td>
					<td>${student.sex }</td>
					<!-- <td><input type="radio" name="sex" value="Male" />Male <input
						type="radio" name="sex" value="FeMale" />Female</td> -->
					<td>${student.address }</td>
					<td>${student.contactNumber }</td>
					<td>${student.image}</td>
					<td>${student.email }</td>
			        <td>${student.userId }</td>
			        <!--  <td><span class="glyphicon glyphicon-home"></span></td> -->
			<%-- <td>
                    <c:forEach var="framework" items="${user.framework}>
                                                             varStatus="loop">
					${framework}
    				        <c:if test="${not loop.last}">,</c:if>
				  </c:forEach>
                                </td>--%>
				<td>
				  <spring:url value="/id/${student.userId}" var="getidUrl" />
				  <spring:url value="/student/${student.id}/delete" var="deleteUrl" />
				  <spring:url value="/updateStudent/${student.userId}" var="updateUrl" />

				  <button class="btn btn-info"
                                          onclick="location.href='${getidUrl}'">Query</button>
				  <button class="btn btn-primary"
                                          onclick="location.href='${updateUrl}'">Update</button>
				  <button class="btn btn-danger"
                                          onclick="location.href='${deleteUrl}'">Delete</button>
                                         
                                </td>
			    </tr>
			</c:forEach> 
			</tbody>
		</table>

		<!-- </form> -->
	</div>
</body>
</html>