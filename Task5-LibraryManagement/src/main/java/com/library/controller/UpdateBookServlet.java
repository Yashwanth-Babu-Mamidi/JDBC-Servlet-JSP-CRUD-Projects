package com.library.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.dao.BookDAO;
import com.library.model.Book;

@WebServlet("/updateBook")

public class UpdateBookServlet extends HttpServlet{

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException{

int id=Integer.parseInt(
req.getParameter("id"));

String title=req.getParameter("title");

String author=req.getParameter("author");

String category=req.getParameter("category");

int quantity=Integer.parseInt(
req.getParameter("quantity"));

Book b=new Book();

b.setBookId(id);

b.setTitle(title);

b.setAuthor(author);

b.setCategory(category);

b.setQuantity(quantity);

BookDAO dao=new BookDAO();

dao.updateBook(b);

res.sendRedirect(
req.getContextPath()+"/listBook");

}

}