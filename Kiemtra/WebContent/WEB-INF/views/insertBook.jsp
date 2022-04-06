<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Books page!</title>
<style>
.colorRed {
	color: red
}
</style>
</head>
<body>
	<h1>INSERT Book</h1>
	<form:form action="insertBook" modelAttribute="b" method="post">
		<table>
			<tr>
				<td>Book Code:</td>
				<td>
					<form:input path="bookCode" />
					<form:errors cssClass="colorRed" path="bookCode"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Book Title:</td>
				<td>
					<form:input path="bookTitle" />
					<form:errors cssClass="colorRed" path="bookTitle"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Author:</td>
				<td>
					<form:input path="author" />
					<form:errors cssClass="colorRed" path="author"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Publishing Company:</td>
				<td>
					<form:input path="publishingCompany" />
					<form:errors cssClass="colorRed" path="publishingCompany"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Publishing Year:</td>
				<td>
					<form:input path="publishingYear" />
					<form:errors cssClass="colorRed" path="publishingYear"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Number Of Pages:</td>
				<td>
					<form:input path="numberOfPages" />
					<form:errors cssClass="colorRed" path="numberOfPages"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Price:</td>
				<td>
					<form:input path="price" />
					<form:errors cssClass="colorRed" path="price"></form:errors>
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Insert"/>
				<input type="reset" value="Clear"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>