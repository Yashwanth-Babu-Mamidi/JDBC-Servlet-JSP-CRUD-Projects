package com.student.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.student.dao.StudentDAO;

@WebServlet("/editStudent")

public class EditStudentServlet extends HttpServlet {

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

try{

int id=Integer.parseInt(
req.getParameter("id"));

StudentDAO dao=new StudentDAO();

ResultSet rs=dao.getStudentById(id);

if(rs.next()){

req.setAttribute("id",
rs.getInt("id"));

req.setAttribute("name",
rs.getString("name"));

req.setAttribute("email",
rs.getString("email"));

req.setAttribute("course",
rs.getString("course"));

RequestDispatcher rd=
req.getRequestDispatcher("/student/editStudent.jsp");

rd.forward(req,res);

}else{

res.getWriter().println("No record found");

}

}catch(Exception e){

e.printStackTrace();

}

}

}