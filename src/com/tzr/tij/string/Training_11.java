package com.tzr.tij.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Training_11 {

	private static final String STR="Java now has regular expressions";
	
	private static String[] regexs=new String[]{"^Java","\\Breg.*","n.w\\s+h(a|i)s",
			"s?","s*","s+","s{4}","s{1}.","s{0,3}"};
	
	public static void main(String[] args) {
		
		for(String regex:regexs){
			System.out.println("Regular expression: \""+regex+"\"");
			Pattern p=Pattern.compile(regex);
			Matcher m=p.matcher(STR);
//			System.out.println("match: "+m.find());
			while (m.find()) {
				System.out.println("Match \""+m.group()+"\" at positions "+m.start()+"-"+(m.end()-1));
				
			}
		}
	}
	
	
}
