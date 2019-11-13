package com.bw.test;

import java.util.Date;

import org.junit.Test;

import com.bw.utils.DateUtils;

public class Test1 {
	
	@Test
	public void test1(){
		Date date = new Date(1970);
		System.out.println(DateUtils.getAge(date));
	}
	
	@Test
	public void test2(){
		String str ="2019-09-19 19:29:39";
		System.out.print(DateUtils.getMonthBegin(str));
	}
	
	//方法4：求未来日期离今天还剩的天数
	@Test
	public void test4(){
		String str ="2020-11-13";
		System.out.print(DateUtils.getFutureDays(str));
	}
	
	
	//方法5：求过去日期离今天过去的天数
	@Test
	public void test5(){
		String str ="2018-11-13";
		System.out.print(DateUtils.getFutureDay(str));
	}
}
