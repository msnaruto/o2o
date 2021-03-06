package com.lyl.o2o.service;

import com.lyl.o2o.BaseTest;
import com.lyl.o2o.entity.Area;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AreaServiceTest extends BaseTest {
	@Autowired
	private AreaService areaService;
	@Autowired
	private CacheService cacheService;

	public AreaServiceTest() {
	}

	@Test
	public void testGetAreaList() {
		List<Area> areaList = this.areaService.getAreaList();
		Assert.assertEquals("西苑", ((Area)areaList.get(0)).getAreaName());
		AreaService var10001 = this.areaService;
		this.cacheService.removeFromCache("arealist");
		areaList = this.areaService.getAreaList();
	}
}
