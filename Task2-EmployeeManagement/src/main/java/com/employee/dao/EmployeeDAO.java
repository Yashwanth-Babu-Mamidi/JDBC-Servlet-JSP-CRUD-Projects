package com.employee.dao;

import java.sql.*;
import java.util.*;

import com.employee.model.Employee;
import com.employee.util.DBConnection;

public class EmployeeDAO {

Connection con;

public EmployeeDAO(){

con=DBConnection.getConnection();

if(con!=null){

System.out.println("DB Connected");

}else{

System.out.println("DB FAILED");

}

}
public void addEmployee(Employee e){

try{

String sql="INSERT INTO employees(emp_name,department,salary) VALUES(?,?,?)";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,e.getEmpName());

ps.setString(2,e.getDepartment());

ps.setDouble(3,e.getSalary());

int rows=ps.executeUpdate();

System.out.println("Rows inserted = "+rows);

}catch(Exception ex){

ex.printStackTrace();

}

}
public Employee getEmployeeById(int id){

Employee e=new Employee();

try{

String sql="SELECT * FROM employees WHERE emp_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setInt(1,id);

ResultSet rs=ps.executeQuery();

if(rs.next()){

e.setEmpId(rs.getInt("emp_id"));

e.setEmpName(rs.getString("emp_name"));

e.setDepartment(rs.getString("department"));

e.setSalary(rs.getDouble("salary"));

}

}catch(Exception ex){

ex.printStackTrace();

}

return e;

}
public void updateEmployee(Employee e){

try{

String sql="UPDATE employees SET emp_name=?,department=?,salary=? WHERE emp_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setString(1,e.getEmpName());

ps.setString(2,e.getDepartment());

ps.setDouble(3,e.getSalary());

ps.setInt(4,e.getEmpId());

ps.executeUpdate();

}catch(Exception ex){

ex.printStackTrace();

}

}
public void deleteEmployee(int id){

try{

String sql="DELETE FROM employees WHERE emp_id=?";

PreparedStatement ps=
con.prepareStatement(sql);

ps.setInt(1,id);

ps.executeUpdate();

}catch(Exception e){

e.printStackTrace();

}

}
public List<Employee> getAllEmployees(){

List<Employee> list=new ArrayList<>();

try{

String sql="select * from employees";

PreparedStatement ps=
con.prepareStatement(sql);

ResultSet rs=ps.executeQuery();

while(rs.next()){

Employee e=new Employee();

e.setEmpId(rs.getInt("emp_id"));

e.setEmpName(rs.getString("emp_name"));

e.setDepartment(rs.getString("department"));

e.setSalary(rs.getDouble("salary"));

list.add(e);

}

}catch(Exception e){

e.printStackTrace();

}

return list;

}

}