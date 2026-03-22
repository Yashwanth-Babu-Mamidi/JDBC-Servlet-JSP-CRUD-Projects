package com.user.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.user.dao.UserDAO;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

String username=req.getParameter("username");

String password=req.getParameter("password");

UserDAO dao=new UserDAO();

if(dao.validateUser(username,password)){

HttpSession session=
req.getSession();

session.setAttribute("username",username);

res.sendRedirect("user/dashboard.jsp");

}else{

res.sendRedirect("user/login.jsp");

}

}

}