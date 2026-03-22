package com.library.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.dao.BookDAO;

@WebServlet("/deleteBook")

public class DeleteBookServlet extends HttpServlet{

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws IOException{

int id=Integer.parseInt(
req.getParameter("id"));

BookDAO dao=new BookDAO();

dao.deleteBook(id);

res.sendRedirect(
req.getContextPath()+"/listBook");

}

}