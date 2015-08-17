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
		split("\\W+");// �ǵ����ַ�����ȥ���� ( \W��ʾ�ǵ����ַ� ) 
		split("n\\W+");// ����n������ǵ����ַ��Ķ���ȥ����
		split("the|you");// 
	}
	
}