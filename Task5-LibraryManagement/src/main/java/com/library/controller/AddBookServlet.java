package com.library.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.dao.BookDAO;
import com.library.model.Book;

@WebServlet("/addBook")

public class AddBookServlet extends HttpServlet{

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException{

String title=req.getParameter("title");

String author=req.getParameter("author");

String category=req.getParameter("category");

int quantity=Integer.parseInt(
req.getParameter("quantity"));

Book b=new Book();

b.setTitle(title);

b.setAuthor(author);

b.setCategory(category);

b.setQuantity(quantity);

BookDAO dao=new BookDAO();

dao.addBook(b);

res.sendRedirect(
req.getContextPath()+"/listBook");

}

}