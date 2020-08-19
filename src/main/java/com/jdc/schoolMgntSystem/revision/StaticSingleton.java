package com.jdc.schoolMgntSystem.revision;

public class StaticSingleton {

private static  StaticSingleton instance ;
	
	private StaticSingleton(){}
	
	static{
		try{
			if(instance==null){
				instance =  new StaticSingleton();
			}
		}catch(Exception e){
			throw new RuntimeException("Error creating  instance ");
		}
	}
	
	public StaticSingleton getInstance(){
		return instance;
	}
}
