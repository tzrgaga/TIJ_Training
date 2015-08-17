package com.tzr.tij.string;

//×Ö·û´®Ìæ»»
public class Replacing {

	private static String s=Splitting.knights;
	
	public static void main(String[] args) {
		String replaceFirstStr= s.replaceFirst("f\\w+", "located");
		String replaceAllStr= s.replaceAll("shrubbery|tree|herring", "banana");
		System.out.println(replaceFirstStr);
		System.out.println(replaceAllStr);
	}
	
	
}
