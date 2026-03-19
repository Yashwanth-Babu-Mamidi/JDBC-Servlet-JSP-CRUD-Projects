package com.employee.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.employee.dao.EmployeeDAO;

@WebServlet("/deleteEmployee")

public class DeleteEmployeeServlet extends HttpServlet {

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(
req.getParameter("id"));

EmployeeDAO dao=new EmployeeDAO();

dao.deleteEmployee(id);

res.sendRedirect(
req.getContextPath()+"/listEmployee");

}

}