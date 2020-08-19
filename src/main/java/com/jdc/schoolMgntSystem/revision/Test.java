package com.jdc.schoolMgntSystem.revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test extends Thread{
	
	
	 public void showmap() {
	        HashMap<Integer, String> hmap= new HashMap<Integer, String>();
	        hmap.put(2, "Anil");
	        hmap.put(44, "Ajit");
	        hmap.put(1, "Brad");
	        hmap.put(4, "Sachin");
	        hmap.put(88, "XYZ");
	        
	        
	        //@Override
	      
	        Map map= Collections.synchronizedMap(hmap);
	        Set set = map.entrySet();
	        synchronized(map){
	            Iterator i = set.iterator();
	            // Display elements
	            while(i.hasNext()) {
	               Map.Entry me = (Map.Entry)i.next();
	               System.out.print(me.getKey() + ": ");
	               System.out.println(me.getValue());
	            }
	        }
			  }

	
	public static void main(String args[]) throws InterruptedException {
		Test obj = new Test();
		
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		
		//t1.start();
		//t2.start();
		
		
		List<String> assetList = new ArrayList();
		String[] asset ={"equity", "stocks", "gold", "foriegn exchange", "fixed income", "futures", "options"};
		//assetList = Arrays.asList(asset); 
		
		Collections.addAll(assetList, asset);
		assetList.add("gold");
		
		System.out.println(assetList);
		for(int i = 0;i<= asset.length-1; i++ )
		System.out.print(asset[i]+ "  ");
		
		///String
		String x= "Shabab";
		System.out.println(x.hashCode());
		System.out.println(x.concat("Hassan").hashCode());
	}
	

}
	

