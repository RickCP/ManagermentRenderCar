package com.rick.management.car.spring.persit.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hang_xe")
public class HangXe implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "hang_xe_id")
	private Integer hangXeId;

	@Column(name = "ten_hang_xe")
	private String tenHangXe;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hangXe")
	private List<DmXe> dmXes;

	public HangXe() {
	}

	public HangXe(String tenHangXe) {
		this.tenHangXe = tenHangXe;
	}

	public HangXe(String tenHangXe, List dmXes) {
		this.tenHangXe = tenHangXe;
		this.dmXes = dmXes;
	}

	public Integer getHangXeId() {
		return this.hangXeId;
	}

	public void setHangXeId(Integer hangXeId) {
		this.hangXeId = hangXeId;
	}

	public String getTenHangXe() {
		return this.tenHangXe;
	}

	public void setTenHangXe(String tenHangXe) {
		this.tenHangXe = tenHangXe;
	}

	public List getDmXes() {
		return this.dmXes;
	}

	public void setDmXes(List dmXes) {
		this.dmXes = dmXes;
	}

}
