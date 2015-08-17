package com.tzr.tij.string;

/**
 * 关于格式化字符串的练习
 * @date:2015-8-17 上午10:05:34
 */
public class StringfomatDemo {

	public static void main(String[] args) {
		foo_1();
		
		
	}
	
	public static void foo_1(){
		int x=5;
		double y=5.332542;
		// the old way 
		System.out.println("Row 1:["+x+" "+y+"]");
		//the new way
		System.out.format("Row 1:[%d %f]\n", x,y);
		//or 
		System.out.printf("Row 1:[%d %f]\n", x,y);
	}
	
	
	
	
	
	
	
	
}
