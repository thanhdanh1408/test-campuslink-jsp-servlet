package com.danhpiglin.model;

import java.util.Date;

public class Job {
	private long soCMND;
	private Date ngayVaoCongTy;
	private int maNganh;
	private String tenCongTy;
	private int thoiGianLamViec;

	// Getters and Setters
	public long getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(long soCMND) {
		this.soCMND = soCMND;
	}

	public Date getNgayVaoCongTy() {
		return ngayVaoCongTy;
	}

	public void setNgayVaoCongTy(Date ngayVaoCongTy) {
		this.ngayVaoCongTy = ngayVaoCongTy;
	}

	public int getMaNganh() {
		return maNganh;
	}

	public void setMaNganh(int maNganh) {
		this.maNganh = maNganh;
	}

	public String getTenCongTy() {
		return tenCongTy;
	}

	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}

	public int getThoiGianLamViec() {
		return thoiGianLamViec;
	}

	public void setThoiGianLamViec(int thoiGianLamViec) {
		this.thoiGianLamViec = thoiGianLamViec;
	}
}