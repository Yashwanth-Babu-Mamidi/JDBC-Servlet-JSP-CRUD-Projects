<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page import="java.util.*" %>
<%@ page import="com.employee.model.Employee" %>

<html>

<body>

<h2>Employee List</h2>

<table border="1">

<tr>

<th>ID</th>

<th>Name</th>

<th>Department</th>

<th>Salary</th>

<th>Edit</th>

<th>Delete</th>

</tr>

<%

List<Employee> list=
(List<Employee>)
request.getAttribute("employeeList");

if(list!=null && !list.isEmpty()){

for(Employee e:list){

%>

<tr>

<td><%=e.getEmpId()%></td>

<td><%=e.getEmpName()%></td>

<td><%=e.getDepartment()%></td>

<td><%=e.getSalary()%></td>

<td>

<a href="<%=request.getContextPath()%>/editEmployee?id=<%=e.getEmpId()%>">
Edit
</a>

</td>

<td>

<a href="<%=request.getContextPath()%>/deleteEmployee?id=<%=e.getEmpId()%>"
onclick="return confirm('Are you sure?')">
Delete
</a>

</td>

</tr>

<%

}

}else{

%>

<tr>

<td colspan="6">No Employees Found</td>

</tr>

<%

}

%>

</table>

<br><br>

<a href="<%=request.getContextPath()%>/employee/addEmployee.jsp">
Add Employee
</a>

</body>

</html>