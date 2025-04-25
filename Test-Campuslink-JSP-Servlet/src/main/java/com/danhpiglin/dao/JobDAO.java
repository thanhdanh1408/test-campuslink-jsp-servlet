package com.danhpiglin.dao;

import com.danhpiglin.config.DBConfig;
import com.danhpiglin.model.Job;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JobDAO {
    public List<Job> getJobsByStudent(long soCMND) throws SQLException {
        List<Job> jobs = new ArrayList<>();
        String sql = "SELECT * FROM CONG_VIEC WHERE SoCMND = ?";
        try (Connection conn = DBConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, soCMND);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Job job = new Job();
                    job.setSoCMND(rs.getLong("SoCMND"));
                    job.setNgayVaoCongTy(rs.getDate("NgayVaoCongTy"));
                    job.setMaNganh(rs.getInt("MaNganh"));
                    job.setTenCongTy(rs.getString("TenCongTy"));
                    job.setThoiGianLamViec(rs.getInt("ThoiGianLamViec"));
                    jobs.add(job);
                }
            }
        }
        return jobs;
    }
}