<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter Book Details</h2>
	<form action="/Book" method="post">
		Book ID: <input type="text" name="bookId"><br> Book Name:
		<input type="text" name="bookName"><br> Book Price: <input
			type="text" name="bookPrice"><br> <input type="submit"
			value="Submit">
	</form>

</body>
</html>