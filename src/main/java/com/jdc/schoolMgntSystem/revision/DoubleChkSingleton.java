package com.jdc.schoolMgntSystem.revision;

public class DoubleChkSingleton {
	
	private static DoubleChkSingleton instance;
	 private DoubleChkSingleton(){}
	 
	 public static synchronized DoubleChkSingleton getInstance(){
		 if(instance == null){
			 synchronized(DoubleChkSingleton.class){
				 if (instance == null){
					 instance = new DoubleChkSingleton();
				 }
			 }
		 }
		 return instance;
	 }

}
