package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.model.Student;
import com.student.util.DBConnection;

public class StudentDAO {

    Connection con;

    public StudentDAO(){

        con=DBConnection.getConnection();

    }

    public void addStudent(Student s){

        try{

            String sql="insert into students(name,email,course) values(?,?,?)";

            PreparedStatement ps=
                    con.prepareStatement(sql);

            ps.setString(1,s.getName());

            ps.setString(2,s.getEmail());

            ps.setString(3,s.getCourse());

            ps.executeUpdate();

        }catch(Exception e){

            e.printStackTrace();
        }

    }
    public void updateStudent(Student s){

        try{

            String sql="UPDATE students SET name=?,email=?,course=? WHERE id=?";

            PreparedStatement ps=
                    con.prepareStatement(sql);

            ps.setString(1,s.getName());

            ps.setString(2,s.getEmail());

            ps.setString(3,s.getCourse());

            ps.setInt(4,s.getId());

            ps.executeUpdate();

        }catch(Exception e){

            e.printStackTrace();
        }

    }
    
    public void deleteStudent(int id){

        try{

            String sql="DELETE FROM students WHERE id=?";

            PreparedStatement ps=
                    con.prepareStatement(sql);

            ps.setInt(1,id);

            ps.executeUpdate();

            System.out.println("Student deleted");

        }catch(Exception e){

            e.printStackTrace();

        }

    }
    public ResultSet getStudentById(int id){

        ResultSet rs=null;

        try{

            String sql="SELECT * FROM students WHERE id=?";

            PreparedStatement ps=
                    con.prepareStatement(sql);

            ps.setInt(1,id);

            rs=ps.executeQuery();

        }catch(Exception e){

            e.printStackTrace();

        }

        return rs;

    }

    public ResultSet getAllStudents(){

        ResultSet rs=null;

        try{

            String sql="select * from students";

            PreparedStatement ps=
                    con.prepareStatement(sql);

            rs=ps.executeQuery();

        }catch(Exception e){

            e.printStackTrace();
        }

        return rs;
    }

}