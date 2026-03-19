package com.product.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.product.dao.ProductDAO;
import com.product.model.Product;

@WebServlet("/addProduct")

public class AddProductServlet extends HttpServlet{

protected void doPost(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException{

String name=req.getParameter("productName");

double price=Double.parseDouble(
req.getParameter("price"));

int quantity=Integer.parseInt(
req.getParameter("quantity"));

String category=req.getParameter("category");

Product p=new Product();

p.setProductName(name);

p.setPrice(price);

p.setQuantity(quantity);

p.setCategory(category);

ProductDAO dao=new ProductDAO();

dao.addProduct(p);

res.sendRedirect(
req.getContextPath()+"/listProduct");

}

}