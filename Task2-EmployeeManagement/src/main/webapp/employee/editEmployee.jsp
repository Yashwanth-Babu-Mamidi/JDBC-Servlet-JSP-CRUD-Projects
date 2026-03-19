<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="com.employee.model.Employee"%>

<%

Employee e=
(Employee)request.getAttribute("employee");

%>

<html>

<body>

<h2>Edit Employee</h2>

<form action="<%=request.getContextPath()%>/updateEmployee" method="post">

ID:
<input type="text"
name="empId"
value="<%=e.getEmpId()%>"
readonly>

<br><br>

Name:
<input type="text"
name="empName"
value="<%=e.getEmpName()%>">

<br><br>

Department:
<input type="text"
name="department"
value="<%=e.getDepartment()%>">

<br><br>

Salary:
<input type="text"
name="salary"
value="<%=e.getSalary()%>">

<br><br>

<input type="submit" value="Update">

</form>

<br><br>

<a href="listEmployees.jsp">
Back
</a>

</body>

</html>