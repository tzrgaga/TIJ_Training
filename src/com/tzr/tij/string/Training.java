package com.tzr.tij.string;

public class Training {

	private int i=1;
	private long l=1000l;
	private float f=1.1f;
	private double d=2.0;
	
	
	
	@Override
	public String toString() {
		return "Training [i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + "]";
	}



	public static void main(String[] args) {
		System.out.println(new Training().toString());
	}
	
}
