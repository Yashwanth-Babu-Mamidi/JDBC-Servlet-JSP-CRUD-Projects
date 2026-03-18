<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%@ page import="com.student.dao.StudentDAO" %>

<html>

<body>

<h2>Students List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Course</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<%

StudentDAO dao=new StudentDAO();

ResultSet rs=dao.getAllStudents();

while(rs.next()){

%>

<tr>

<td><%=rs.getInt("id")%></td>

<td><%=rs.getString("name")%></td>

<td><%=rs.getString("email")%></td>

<td><%=rs.getString("course")%></td>

<td>

<a href="<%=request.getContextPath()%>/editStudent?id=<%=rs.getInt("id")%>">
Edit
</a>

</td>

<td>

<a href="<%=request.getContextPath()%>/deleteStudent?id=<%=rs.getInt("id")%>">
Delete
</a>

</td>

</tr>

<%
}
%>

</table>

<br><br>

<a href="addStudent.jsp">Add New Student</a>

</body>

</html>