package com.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.product.dao.ProductDAO;

@WebServlet("/deleteProduct")

public class DeleteProductServlet extends HttpServlet {

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(
req.getParameter("id"));

ProductDAO dao=new ProductDAO();

dao.deleteProduct(id);

res.sendRedirect(
req.getContextPath()+"/listProduct");

}

}