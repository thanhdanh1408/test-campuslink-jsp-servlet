package com.danhpiglin.dao;

import com.danhpiglin.config.DBConfig;
import com.danhpiglin.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(Student student) throws SQLException {
        String sql = "INSERT INTO SINHVIEN (SoCMND, HoTen, Email, SoDT, DiaChi) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, student.getSoCMND());
            stmt.setString(2, student.getHoTen());
            stmt.setString(3, student.getEmail());
            stmt.setLong(4, student.getSoDT());
            stmt.setString(5, student.getDiaChi());
            stmt.executeUpdate();
        }
    }
    
    public List<Student> searchStudents(String keyword) throws SQLException {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM SINHVIEN WHERE HoTen LIKE ? OR SoCMND LIKE ?";
        try (Connection conn = DBConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + keyword + "%");
            stmt.setString(2, "%" + keyword + "%");
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Student student = new Student();
                    student.setSoCMND(rs.getLong("SoCMND"));
                    student.setHoTen(rs.getString("HoTen"));
                    student.setEmail(rs.getString("Email"));
                    student.setSoDT(rs.getLong("SoDT"));
                    student.setDiaChi(rs.getString("DiaChi"));
                    students.add(student);
                }
            }
        }
        return students;
    }
}