<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>

<h2>Add Product</h2>

<form action="../addProduct" method="post">

Name:
<input type="text" name="productName">

<br><br>

Price:
<input type="text" name="price">

<br><br>

Quantity:
<input type="text" name="quantity">

<br><br>

Category:
<input type="text" name="category">

<br><br>

<input type="submit" value="Add Product">

</form>

<br><br>

<a href="../listProduct">
View Products
</a>

</body>

</html>