package com.tzr.tij.string;

import java.util.Arrays;

public class Splitting {

	public static String knights="Then, when you have found the shrubbery, you must "+
								 "cut down the mightiest tree in the forest... "+
								 "with... a herring!";
	
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	
	public static void main(String[] args) {
		split(" ");
		split("\\W+");// 非单词字符都被去除了 ( \W表示非单词字符 ) 
		split("n\\W+");// 这里n后面带非单词字符的都被去除了
		split("the|you");// 
	}
	
}
