package com.library.dao;

import java.sql.*;
import java.util.*;

import com.library.model.Book;
import com.library.util.DBConnection;

public class BookDAO {

Connection con;

public BookDAO(){

con=DBConnection.getConnection();

}

public void addBook(Book b){

try{

String sql="INSERT INTO books(title,author,category,quantity) VALUES(?,?,?,?)";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,b.getTitle());

ps.setString(2,b.getAuthor());

ps.setString(3,b.getCategory());

ps.setInt(4,b.getQuantity());

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}

public List<Book> getAllBooks(){

List<Book> list=new ArrayList<>();

try{

String sql="SELECT * FROM books";

PreparedStatement ps=
con.prepareStatement(sql);

ResultSet rs=ps.executeQuery();

while(rs.next()){

Book b=new Book();

b.setBookId(rs.getInt("book_id"));

b.setTitle(rs.getString("title"));

b.setAuthor(rs.getString("author"));

b.setCategory(rs.getString("category"));

b.setQuantity(rs.getInt("quantity"));

list.add(b);

}

}catch(Exception e){

e.printStackTrace();

}

return list;

}
public Book getBookById(int id){

Book b=new Book();

try{

String sql="SELECT * FROM books WHERE book_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setInt(1,id);

ResultSet rs=ps.executeQuery();

if(rs.next()){

b.setBookId(rs.getInt("book_id"));

b.setTitle(rs.getString("title"));

b.setAuthor(rs.getString("author"));

b.setCategory(rs.getString("category"));

b.setQuantity(rs.getInt("quantity"));

}

}catch(Exception e){

e.printStackTrace();

}

return b;

}
public void updateBook(Book b){

try{

String sql="UPDATE books SET title=?,author=?,category=?,quantity=? WHERE book_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,b.getTitle());

ps.setString(2,b.getAuthor());

ps.setString(3,b.getCategory());

ps.setInt(4,b.getQuantity());

ps.setInt(5,b.getBookId());

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}
public void deleteBook(int id){

try{

String sql="DELETE FROM books WHERE book_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setInt(1,id);

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}
public List<Book> searchBookByTitle(String title){

List<Book> list=new ArrayList<>();

try{

String sql="SELECT * FROM books WHERE title LIKE ?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,"%"+title+"%");

ResultSet rs=ps.executeQuery();

while(rs.next()){

Book b=new Book();

b.setBookId(rs.getInt("book_id"));

b.setTitle(rs.getString("title"));

b.setAuthor(rs.getString("author"));

b.setCategory(rs.getString("category"));

b.setQuantity(rs.getInt("quantity"));

list.add(b);

}

}catch(Exception e){

e.printStackTrace();

}

return list;

}

}