package com.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.student.dao.StudentDAO;

@WebServlet("/deleteStudent")

public class DeleteStudentServlet extends HttpServlet {

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(
req.getParameter("id"));

StudentDAO dao=new StudentDAO();

dao.deleteStudent(id);

res.sendRedirect(
"student/viewStudents.jsp");

}

}