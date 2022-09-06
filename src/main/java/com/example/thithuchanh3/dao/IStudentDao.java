package com.example.thithuchanh3.dao;

import com.example.thithuchanh3.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface IStudentDao {
    List<Student> selectAllStudent();
    Student selectStudent(String name);

    void insertStudent(Student student) throws SQLException;
    boolean deleteStudent(int id) throws SQLException;
    boolean updateStudent(Student student) throws SQLException;
}
