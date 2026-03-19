package com.product.dao;

import java.sql.*;
import java.util.*;

import com.product.model.Product;
import com.product.util.DBConnection;

public class ProductDAO {

Connection con;

public ProductDAO(){

con=DBConnection.getConnection();

}

public void addProduct(Product p){

try{

String sql="INSERT INTO products(product_name,price,quantity,category) VALUES(?,?,?,?)";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,p.getProductName());

ps.setDouble(2,p.getPrice());

ps.setInt(3,p.getQuantity());

ps.setString(4,p.getCategory());

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}

public Product getProductById(int id){

Product p=new Product();

try{

String sql="SELECT * FROM products WHERE product_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setInt(1,id);

ResultSet rs=ps.executeQuery();

if(rs.next()){

p.setProductId(rs.getInt("product_id"));

p.setProductName(rs.getString("product_name"));

p.setPrice(rs.getDouble("price"));

p.setQuantity(rs.getInt("quantity"));

p.setCategory(rs.getString("category"));

}

}catch(Exception e){

e.printStackTrace();

}

return p;

}
public void updateProduct(Product p){

try{

String sql="UPDATE products SET product_name=?,price=?,quantity=?,category=? WHERE product_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,p.getProductName());

ps.setDouble(2,p.getPrice());

ps.setInt(3,p.getQuantity());

ps.setString(4,p.getCategory());

ps.setInt(5,p.getProductId());

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}
public void deleteProduct(int id){

try{

String sql="DELETE FROM products WHERE product_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setInt(1,id);

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}
public List<Product> getAllProducts(){

List<Product> list=new ArrayList<>();

try{

String sql="SELECT * FROM products";

PreparedStatement ps=
con.prepareStatement(sql);

ResultSet rs=ps.executeQuery();

while(rs.next()){

Product p=new Product();

p.setProductId(rs.getInt("product_id"));

p.setProductName(rs.getString("product_name"));

p.setPrice(rs.getDouble("price"));

p.setQuantity(rs.getInt("quantity"));

p.setCategory(rs.getString("category"));

list.add(p);

}

}catch(Exception e){

e.printStackTrace();

}

return list;

}

}