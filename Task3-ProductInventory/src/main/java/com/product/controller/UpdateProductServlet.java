package com.product.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.product.dao.ProductDAO;
import com.product.model.Product;

@WebServlet("/updateProduct")

public class UpdateProductServlet extends HttpServlet {

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException {

int id=Integer.parseInt(
req.getParameter("productId"));

String name=req.getParameter("productName");

double price=Double.parseDouble(
req.getParameter("price"));

int quantity=Integer.parseInt(
req.getParameter("quantity"));

String category=req.getParameter("category");

Product p=new Product();

p.setProductId(id);

p.setProductName(name);

p.setPrice(price);

p.setQuantity(quantity);

p.setCategory(category);

ProductDAO dao=new ProductDAO();

dao.updateProduct(p);

res.sendRedirect(
req.getContextPath()+"/listProduct");

}

}