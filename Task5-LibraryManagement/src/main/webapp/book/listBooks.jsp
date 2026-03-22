<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ page import="com.library.model.Book"%>

<html>

<body>

<h2>Book List</h2>

<form action="<%=request.getContextPath()%>/searchBook" method="get">

Search by title:

<input type="text" name="title">

<input type="submit" value="Search">

</form>

<br>

<table border="1">

<tr>

<th>ID</th>

<th>Title</th>

<th>Author</th>

<th>Category</th>

<th>Quantity</th>

<th>Edit</th>

<th>Delete</th>

</tr>

<%

List<Book> list =
(List<Book>)request.getAttribute("bookList");

if(list!=null && !list.isEmpty()){

for(Book b:list){

%>

<tr>

<td><%=b.getBookId()%></td>

<td><%=b.getTitle()%></td>

<td><%=b.getAuthor()%></td>

<td><%=b.getCategory()%></td>

<td><%=b.getQuantity()%></td>

<td>

<a href="<%=request.getContextPath()%>/editBook?id=<%=b.getBookId()%>">
Edit
</a>

</td>

<td>

<a href="<%=request.getContextPath()%>/deleteBook?id=<%=b.getBookId()%>"
onclick="return confirm('Are you sure you want to delete this book?')">
Delete
</a>

</td>

</tr>

<%

}

}else{

%>

<tr>

<td colspan="7">No Books Available</td>

</tr>

<%

}

%>

</table>

<br><br>

<a href="<%=request.getContextPath()%>/book/addBook.jsp">
Add Book
</a>

</body>

</html>