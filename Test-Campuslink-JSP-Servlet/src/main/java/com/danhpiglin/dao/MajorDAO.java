package com.danhpiglin.dao;

import com.danhpiglin.config.DBConfig;
import com.danhpiglin.model.Major;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MajorDAO {
    public List<Major> getAllMajors() throws SQLException {
        List<Major> majors = new ArrayList<>();
        String sql = "SELECT * FROM NGANH";
        try (Connection conn = DBConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Major major = new Major();
                major.setMaNganh(rs.getInt("MaNganh"));
                major.setTenNganh(rs.getString("TenNganh"));
                major.setLoaiNganh(rs.getString("LoaiNganh"));
                majors.add(major);
            }
        }
        return majors;
    }
}