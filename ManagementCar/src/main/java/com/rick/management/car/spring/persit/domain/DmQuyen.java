package com.rick.management.car.spring.persit.domain;

// Generated Mar 21, 2014 9:47:53 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * DmQuyen generated by hbm2java
 */
@Entity
@Table(name = "dm_quyen", catalog = "managementrendercar")
public class DmQuyen implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer dmQuyenId;
	private Quyen quyen;
	private int quanliId;
	private Date ngayBatDau;
	private Date ngayKetThuc;
	private Set<User> users = new HashSet<User>(0);

	public DmQuyen() {
	}

	public DmQuyen(Quyen quyen, int quanliId) {
		this.quyen = quyen;
		this.quanliId = quanliId;
	}

	public DmQuyen(Quyen quyen, int quanliId, Date ngayBatDau,
			Date ngayKetThuc, Set<User> users) {
		this.quyen = quyen;
		this.quanliId = quanliId;
		this.ngayBatDau = ngayBatDau;
		this.ngayKetThuc = ngayKetThuc;
		this.users = users;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dm_quyen_id", unique = true, nullable = false)
	public Integer getDmQuyenId() {
		return this.dmQuyenId;
	}

	public void setDmQuyenId(Integer dmQuyenId) {
		this.dmQuyenId = dmQuyenId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "quyen_id", nullable = false)
	public Quyen getQuyen() {
		return this.quyen;
	}

	public void setQuyen(Quyen quyen) {
		this.quyen = quyen;
	}

	@Column(name = "quanli_id", nullable = false)
	public int getQuanliId() {
		return this.quanliId;
	}

	public void setQuanliId(int quanliId) {
		this.quanliId = quanliId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ngay_bat_dau", length = 19)
	public Date getNgayBatDau() {
		return this.ngayBatDau;
	}

	public void setNgayBatDau(Date ngayBatDau) {
		this.ngayBatDau = ngayBatDau;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ngay_ket_thuc", length = 19)
	public Date getNgayKetThuc() {
		return this.ngayKetThuc;
	}

	public void setNgayKetThuc(Date ngayKetThuc) {
		this.ngayKetThuc = ngayKetThuc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dmQuyen")
	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}