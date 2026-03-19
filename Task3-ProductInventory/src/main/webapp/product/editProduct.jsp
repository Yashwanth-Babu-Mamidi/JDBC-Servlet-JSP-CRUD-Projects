<%@ page import="com.product.model.Product"%>

<%

Product p=
(Product)request.getAttribute("product");

%>

<html>

<body>

<h2>Edit Product</h2>

<form action="<%=request.getContextPath()%>/updateProduct" method="post">

ID:
<input type="text"
name="productId"
value="<%=p.getProductId()%>"
readonly>

<br><br>

Name:
<input type="text"
name="productName"
value="<%=p.getProductName()%>">

<br><br>

Price:
<input type="text"
name="price"
value="<%=p.getPrice()%>">

<br><br>

Quantity:
<input type="text"
name="quantity"
value="<%=p.getQuantity()%>">

<br><br>

Category:
<input type="text"
name="category"
value="<%=p.getCategory()%>">

<br><br>

<input type="submit" value="Update">

</form>

<br><br>

<a href="<%=request.getContextPath()%>/listProduct">
Back
</a>

</body>

</html>