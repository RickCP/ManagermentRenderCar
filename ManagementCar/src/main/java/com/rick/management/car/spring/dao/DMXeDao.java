package com.rick.management.car.spring.dao;

import java.util.List;

import com.rick.management.car.spring.persit.domain.DmQuyen;
import com.rick.management.car.spring.persit.domain.DmXe;
import com.rick.management.car.spring.persit.domain.GiaXe;
import com.rick.management.car.spring.persit.domain.HangXe;
import com.rick.management.car.spring.persit.domain.LoaiXe;

public interface DMXeDao {
	public List<DmXe> getAllDmXes();
	
	public LoaiXe getLoaiXeById(int id);
	
	public GiaXe getGiaXeById(int id);
	
	public HangXe getHangXeById(int id);
	
	public List<DmQuyen> getAllDmQuyens();

}
