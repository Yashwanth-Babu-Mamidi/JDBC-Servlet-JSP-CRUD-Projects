package com.user.dao;

import java.sql.*;

import com.user.model.User;
import com.user.util.DBConnection;

public class UserDAO {

Connection con;

public UserDAO(){

con=DBConnection.getConnection();

}

public void registerUser(User u){

try{

String sql="INSERT INTO users(username,email,password) VALUES(?,?,?)";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,u.getUsername());

ps.setString(2,u.getEmail());

ps.setString(3,u.getPassword());

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}

public boolean validateUser(String username,String password){

boolean status=false;

try{

String sql="SELECT * FROM users WHERE username=? AND password=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,username);

ps.setString(2,password);

ResultSet rs=ps.executeQuery();

status=rs.next();

}catch(Exception e){

e.printStackTrace();

}

return status;

}

}