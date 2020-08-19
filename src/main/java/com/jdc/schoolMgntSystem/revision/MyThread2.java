package com.jdc.schoolMgntSystem.revision;

public class MyThread2 extends Thread{

	
	Test t;  
	MyThread2(Test t){  
	this.t=t;  
	}  
	public void run(){  
		System.out.println("MyThread2 called");
	t.showmap();  
	} 
}
