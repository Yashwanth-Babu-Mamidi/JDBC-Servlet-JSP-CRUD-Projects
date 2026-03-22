package com.user.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.user.dao.UserDAO;
import com.user.model.User;

@WebServlet("/register")

public class RegisterServlet extends HttpServlet {

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

String username=req.getParameter("username");

String email=req.getParameter("email");

String password=req.getParameter("password");

User u=new User();

u.setUsername(username);

u.setEmail(email);

u.setPassword(password);

UserDAO dao=new UserDAO();

dao.registerUser(u);

res.sendRedirect("user/login.jsp");

}

}