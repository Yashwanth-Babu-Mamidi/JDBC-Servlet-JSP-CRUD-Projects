<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<html>

<body>

<h2>Edit Student</h2>

<%
Integer id=(Integer)request.getAttribute("id");
String name=(String)request.getAttribute("name");
String email=(String)request.getAttribute("email");
String course=(String)request.getAttribute("course");
%>

<form action="<%=request.getContextPath()%>/updateStudent" method="post">

ID:
<input type="text"
name="id"
value="<%=id!=null?id:""%>"
readonly>

<br><br>

Name:
<input type="text"
name="name"
value="<%=name!=null?name:""%>">

<br><br>

Email:
<input type="text"
name="email"
value="<%=email!=null?email:""%>">

<br><br>

Course:
<input type="text"
name="course"
value="<%=course!=null?course:""%>">

<br><br>

<input type="submit" value="Update">

</form>

<br><br>

<a href="viewStudents.jsp">Back</a>

</body>

</html>