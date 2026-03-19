package com.employee.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

@WebServlet("/listEmployee")

public class ListEmployeeServlet extends HttpServlet {

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

EmployeeDAO dao=new EmployeeDAO();

List<Employee> list=
dao.getAllEmployees();

req.setAttribute("employeeList",list);

RequestDispatcher rd=
req.getRequestDispatcher(
"employee/listEmployees.jsp");

rd.forward(req,res);

}

}