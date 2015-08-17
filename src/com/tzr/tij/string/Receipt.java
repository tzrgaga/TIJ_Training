package com.tzr.tij.string;

import java.util.Formatter;

public class Receipt {
	/*
	 * ��ʽ��˵����
	 * �ڲ�������ʱ�������Ҫ���ƿո�����룬����Ҫ���Ӿ�ϸ���ӵĸ�ʽ���η�
	 * �﷨�� %[argument_index$][flags][width][.precision]conversion
	 * 
	 1	��ѡ�� argument_index ��һ��ʮ�������������ڱ��������ڲ����б��е�λ�á���һ�������� "1$" ���ã��ڶ��������� "2$" ���ã��������ơ� 

	 2	��ѡ flags ���޸������ʽ���ַ�������Ч��־��ȡ����ת�����͡� 

	 3	��ѡ width ��һ���Ǹ�ʮ��������������Ҫ�������д��������ַ����� 

	 4	��ѡ precision ��һ���Ǹ�ʮ����������ͨ�����������ַ������ض���Ϊȡ����ת�����͡� 

	 5	���� conversion ��һ������Ӧ����θ�ʽ���������ַ���������������Чת����ȡ���ڲ������������͡�

	 * 
	 * 
	 */
	private double total=0;
	private Formatter f=new Formatter(System.out);
	
	private void printTitle(){
		f.format("%-15s %5s %10s\n", "Item","Qty","Price");
		f.format("%-15s %5s %10s\n", "----","----","----");
	}
	
	private void print(String name,int qty,double price){
		f.format("%-15.15s %5d %10.2f\n",name,qty,price);
		total+=price;
	}
	private void printTotal(){
		f.format("%-15s %5s %10.2f\n", "Tax","",total*0.06);
		f.format("%-15s %5s %10s\n", "","","-----");
		f.format("%-15s %5s %10.2f\n", "Total","",total*1.06);
	}
	
	public static void main(String[] args) {
		Receipt receipt=new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Princess Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
	
	
	
}