package com.danhpiglin.dao;

import com.danhpiglin.config.DBConfig;
import com.danhpiglin.model.School;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SchoolDAO {
    public List<School> getAllSchools() throws SQLException {
        List<School> schools = new ArrayList<>();
        String sql = "SELECT * FROM TRUONG";
        try (Connection conn = DBConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                School school = new School();
                school.setMaTruong(rs.getInt("MaTruong"));
                school.setTenTruong(rs.getString("TenTruong"));
                school.setDiaChi(rs.getString("DiaChi"));
                school.setSoDT(rs.getLong("SoDT"));
                schools.add(school);
            }
        }
        return schools;
    }
}