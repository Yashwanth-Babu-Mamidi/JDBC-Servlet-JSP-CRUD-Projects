package com.library.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.library.dao.BookDAO;
import com.library.model.Book;

@WebServlet("/listBook")

public class ListBookServlet extends HttpServlet{

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException{

BookDAO dao=new BookDAO();

List<Book> list=
dao.getAllBooks();

req.setAttribute("bookList",list);

RequestDispatcher rd=
req.getRequestDispatcher(
"/book/listBooks.jsp");

rd.forward(req,res);

}

}