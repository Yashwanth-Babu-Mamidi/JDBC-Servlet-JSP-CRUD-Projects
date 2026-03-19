package com.product.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.product.dao.ProductDAO;
import com.product.model.Product;

@WebServlet("/editProduct")

public class EditProductServlet extends HttpServlet {

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(
req.getParameter("id"));

ProductDAO dao=new ProductDAO();

Product p=
dao.getProductById(id);

req.setAttribute("product",p);

RequestDispatcher rd=
req.getRequestDispatcher(
"/product/editProduct.jsp");

rd.forward(req,res);

}

}