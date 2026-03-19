package com.employee.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

@WebServlet("/updateEmployee")

public class UpdateEmployeeServlet extends HttpServlet {

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(
req.getParameter("empId"));

String name=req.getParameter("empName");

String dept=req.getParameter("department");

double salary=Double.parseDouble(
req.getParameter("salary"));

Employee e=new Employee();

e.setEmpId(id);

e.setEmpName(name);

e.setDepartment(dept);

e.setSalary(salary);

EmployeeDAO dao=new EmployeeDAO();

dao.updateEmployee(e);

res.sendRedirect(
req.getContextPath()+"/listEmployee");

}

}