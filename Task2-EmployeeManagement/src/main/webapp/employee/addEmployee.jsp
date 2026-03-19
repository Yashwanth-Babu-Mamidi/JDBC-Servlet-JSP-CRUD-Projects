<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>

<h2>Add Employee</h2>

<form action="<%=request.getContextPath()%>/addEmployee" method="post"> 	
Name:

<input type="text" name="empName">

<br><br>

Department:

<input type="text" name="department">

<br><br>

Salary:

<input type="text" name="salary">

<br><br>

<input type="submit" value="Add Employee">

</form>

<br><br>

<a href="../listEmployee">
View Employees
</a>

</body>

</html>