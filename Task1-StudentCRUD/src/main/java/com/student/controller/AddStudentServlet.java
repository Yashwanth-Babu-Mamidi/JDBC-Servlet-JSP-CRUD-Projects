package com.student.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StudentDAO;
import com.student.model.Student;

@WebServlet("/addStudent")

public class AddStudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        String name=req.getParameter("name");

        String email=req.getParameter("email");

        String course=req.getParameter("course");

        Student s=new Student();

        s.setName(name);

        s.setEmail(email);

        s.setCourse(course);

        StudentDAO dao=new StudentDAO();

        dao.addStudent(s);

        res.sendRedirect("student/addStudent.jsp");

    }

}