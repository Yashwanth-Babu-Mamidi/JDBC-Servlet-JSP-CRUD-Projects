package com.employee.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

@WebServlet("/editEmployee")

public class EditEmployeeServlet extends HttpServlet {

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(
req.getParameter("id"));

EmployeeDAO dao=new EmployeeDAO();

Employee e=
dao.getEmployeeById(id);

req.setAttribute("employee",e);

RequestDispatcher rd=
req.getRequestDispatcher(
"/employee/editEmployee.jsp");

rd.forward(req,res);

}

}