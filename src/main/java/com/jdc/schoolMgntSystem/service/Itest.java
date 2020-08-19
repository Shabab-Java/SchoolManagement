package com.jdc.schoolMgntSystem.service;

public class Itest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test Mylambda = (int a, int b )->{
			int x=5;
			if(x<4){
			return a+b;}else
				return 0;};
System.out.println(Mylambda.add(3, 4));
	}

}
