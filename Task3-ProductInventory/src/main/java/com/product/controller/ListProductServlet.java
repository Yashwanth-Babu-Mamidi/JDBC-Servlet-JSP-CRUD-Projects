package com.product.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.product.dao.ProductDAO;
import com.product.model.Product;

@WebServlet("/listProduct")

public class ListProductServlet extends HttpServlet{

protected void doGet(HttpServletRequest req,
HttpServletResponse res)
throws ServletException, IOException{

ProductDAO dao=new ProductDAO();

List<Product> list=
dao.getAllProducts();

req.setAttribute("productList",list);

RequestDispatcher rd=
req.getRequestDispatcher(
"/product/listProducts.jsp");

rd.forward(req,res);

}

}