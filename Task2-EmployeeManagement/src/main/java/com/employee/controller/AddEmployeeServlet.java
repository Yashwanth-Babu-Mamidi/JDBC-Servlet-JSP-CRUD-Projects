package com.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

@WebServlet("/addEmployee")

public class AddEmployeeServlet extends HttpServlet {

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

String name=req.getParameter("empName");

String dept=req.getParameter("department");

double salary=Double.parseDouble(
req.getParameter("salary"));

Employee e=new Employee();

e.setEmpName(name);

e.setDepartment(dept);

e.setSalary(salary);

EmployeeDAO dao=new EmployeeDAO();

dao.addEmployee(e);

System.out.println("Insert method called");

res.sendRedirect("listEmployee");

}

}