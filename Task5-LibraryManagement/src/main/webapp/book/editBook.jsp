<%@ page import="com.library.model.Book"%>

<%

Book b=(Book)request.getAttribute("book");

%>

<html>

<body>

<h2>Edit Book</h2>

<form action="<%=request.getContextPath()%>/updateBook" method="post">

<input type="hidden" name="id"
value="<%=b.getBookId()%>">

Title:
<input type="text" name="title"
value="<%=b.getTitle()%>">

<br><br>

Author:
<input type="text" name="author"
value="<%=b.getAuthor()%>">

<br><br>

Category:
<input type="text" name="category"
value="<%=b.getCategory()%>">

<br><br>

Quantity:
<input type="text" name="quantity"
value="<%=b.getQuantity()%>">

<br><br>

<input type="submit" value="Update">

</form>

</body>

</html>