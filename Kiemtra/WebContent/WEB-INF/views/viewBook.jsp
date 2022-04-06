<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Books page!</title>
</head>
<body>
	<h1>VIEW Books</h1>
		<table>
			<tr>
				<td>Book Code:</td>
				<td>${b.bookCode}</td>
			</tr>
			<tr>
				<td>Book Title:</td>
				<td>${b.bookTitle}</td>
			</tr>
			<tr>
				<td>Author:</td>
				<td>${b.author} </td>
			</tr>
			<tr>
				<td>Publishing Company:</td>
				<td>${b.publishingCompany}</td>
			</tr>			
			<tr>
				<td>Publishing Year:</td>
				<td>${b.publishingYear}</td>
			</tr>			
			<tr>
				<td>Number Of Pages:</td>
				<td>${b.numberOfPages}</td>
			</tr>			
			<tr>
				<td>Price:</td>
				<td>${b.price}</td>
			</tr>			
		</table>
		<a href="home">Back</a>
</body>
</html>