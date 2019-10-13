package com.dong.common.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilTest {

	@Test
	void testGetDateByInitMonth() {
		
		//自己设置日期
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018, 2,23,12,12,28);
		
		//获取系统日期
		//Date date = DateUtil.getDateByInitMonth(new Date());
		
		//获取输入日期
		Date date = DateUtil.getDateByInitMonth(calendar.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}

	@Test
	void testGetDateByFullMonth() {
		//自己设置日期
		Calendar calendar = Calendar.getInstance();
		calendar.set(2018, 2,23,12,12,28);
		
		//Date date = DateUtil.getDateByFullMonth(new Date());
		Date date = DateUtil.getDateByInitMonth(calendar.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	
	}

}
