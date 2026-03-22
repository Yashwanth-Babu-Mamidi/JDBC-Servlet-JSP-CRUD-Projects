<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>

<h2>Add Book</h2>

<form action="../addBook" method="post">

Title:
<input type="text" name="title">

<br><br>

Author:
<input type="text" name="author">

<br><br>

Category:
<input type="text" name="category">

<br><br>

Quantity:
<input type="text" name="quantity">

<br><br>

<input type="submit" value="Add Book">

</form>

<br><br>

<a href="../listBook">
View Books
</a>

</body>

</html>