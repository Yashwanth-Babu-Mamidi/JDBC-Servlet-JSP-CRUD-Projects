
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<body>

<h2>Product List</h2>

<table border="1">

<tr>

<th>ID</th>

<th>Name</th>

<th>Price</th>

<th>Quantity</th>

<th>Category</th>

<th>Edit</th>

<th>Delete</th>

</tr>

<c:forEach var="p" items="${productList}">

<tr>

<td>${p.productId}</td>

<td>${p.productName}</td>

<td>${p.price}</td>

<td>${p.quantity}</td>

<td>${p.category}</td>

<td>

<a href="${pageContext.request.contextPath}/editProduct?id=${p.productId}">
Edit
</a>

</td>

<td>

<a href="${pageContext.request.contextPath}/deleteProduct?id=${p.productId}"
onclick="return confirm('Delete this product?')">
Delete
</a>

</td>

</tr>

</c:forEach>

</table>

<br><br>

<a href="${pageContext.request.contextPath}/product/addProduct.jsp">

Add Product

</a>

</body>

</html>