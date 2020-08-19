package com.jdc.schoolMgntSystem.revision;

public class MyThread1 extends Thread{

	
	Test t;  
	MyThread1(Test t){  
	this.t=t;  
	}  
	public void run(){  
		System.out.println("MyThread1 called");
	t.showmap();  
	}  
}
