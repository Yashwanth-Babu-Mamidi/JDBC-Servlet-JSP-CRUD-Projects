package com.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.student.dao.StudentDAO;
import com.student.model.Student;

@WebServlet("/updateStudent")

public class UpdateStudentServlet extends HttpServlet {

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(req.getParameter("id"));

String name=req.getParameter("name");

String email=req.getParameter("email");

String course=req.getParameter("course");

Student s=new Student();

s.setId(id);
s.setName(name);
s.setEmail(email);
s.setCourse(course);

StudentDAO dao=new StudentDAO();

dao.updateStudent(s);

res.sendRedirect("student/viewStudents.jsp");

}

}