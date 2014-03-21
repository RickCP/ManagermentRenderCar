package com.rick.management.car.spring.persit.domain;

// Generated Mar 16, 2014 1:24:02 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ChiTietNhapXe generated by hbm2java
 */
@Entity
@Table(name = "chi_tiet_nhap_xe", catalog = "managementrendercar")
public class ChiTietNhapXe implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer chiTietNhapXeId;
	private NhapXe nhapXe;
	private DmXe dmXe;
	private Integer soLuong;
	private Float donGia;

	public ChiTietNhapXe() {
	}

	public ChiTietNhapXe(NhapXe nhapXe, DmXe dmXe, Integer soLuong, Float donGia) {
		this.nhapXe = nhapXe;
		this.dmXe = dmXe;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "chi_tiet_nhap_xe_id", unique = true, nullable = false)
	public Integer getChiTietNhapXeId() {
		return this.chiTietNhapXeId;
	}

	public void setChiTietNhapXeId(Integer chiTietNhapXeId) {
		this.chiTietNhapXeId = chiTietNhapXeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nhap_xe_id")
	public NhapXe getNhapXe() {
		return this.nhapXe;
	}

	public void setNhapXe(NhapXe nhapXe) {
		this.nhapXe = nhapXe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dm_xe_id")
	public DmXe getDmXe() {
		return this.dmXe;
	}

	public void setDmXe(DmXe dmXe) {
		this.dmXe = dmXe;
	}

	@Column(name = "so_luong")
	public Integer getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	@Column(name = "don_gia", precision = 12, scale = 0)
	public Float getDonGia() {
		return this.donGia;
	}

	public void setDonGia(Float donGia) {
		this.donGia = donGia;
	}

}