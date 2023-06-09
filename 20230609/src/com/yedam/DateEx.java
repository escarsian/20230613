package com.yedam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.getTime()); // 1970년 1월 1일 0시 0분 0초 기준
		// 53년 6월 9일 * 24*60*60*1000

		long curr = 1686283269779L / (24 * 60 * 60 * 1000);
		System.out.println(today.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String result = sdf.format(today);
		result = "2022/01/01 13:20:22";
		
		try {
			Date resultDate = sdf.parse(result);
			System.out.println(resultDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		result = dateToStr(today, "yyyy/MM/dd");
		System.out.println(result);
	}
	
	
	
	public static String dateToStr(Date date, String pattern) {
		// 처리.
		
		return null;
	}
}
