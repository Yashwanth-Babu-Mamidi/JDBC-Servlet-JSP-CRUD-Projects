package com.library.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.dao.BookDAO;
import com.library.model.Book;

@WebServlet("/editBook")

public class EditBookServlet extends HttpServlet{

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException{

int id=Integer.parseInt(
req.getParameter("id"));

BookDAO dao=new BookDAO();

Book b=dao.getBookById(id);

req.setAttribute("book",b);

RequestDispatcher rd=
req.getRequestDispatcher(
"/book/editBook.jsp");

rd.forward(req,res);

}

}