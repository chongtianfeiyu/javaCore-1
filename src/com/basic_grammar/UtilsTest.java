package com.basic_grammar;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

import com.utils.DateUtils;

/**
 *
 * @Message:  created by Liujishuai on 2016年1月5日
 * 
 * @Description: 测试工具类使用
 */
public class UtilsTest {
  
	
	@Test
	public void testDateUtils(){
		
		DateTime dateTime=new DateTime();
		DateTime now=DateTime.now();
		System.out.println("时间啊："+dateTime);
		System.out.println("时间啊："+now);
		System.out.println("时间:"+dateTime.toString(DateUtils.yyyyMM));
		System.out.println("时间2:"+dateTime.toString(DateUtils.date_sdf_wz_e));
		System.out.println("时间3:"+dateTime.toString(DateUtils.date_sdf_wz_hhmmss_e));
		System.out.println("当前时间戳:"+DateUtils.getCurrentUnixTimeStamp());
		System.out.println("指定时间时间戳:"+DateUtils.getUnixTimeStamp(new Date()));
		System.out.println("当前月份第一天时间戳:"+DateUtils.getCurrentMonthZeroTimeStamp());
		System.out.println("下个月第一天时间戳:"+DateUtils.getNextMonthZeroStamp());
		System.out.println("今天零点时间戳:"+DateUtils.getTodayZeroStamp());
		
	}
}

