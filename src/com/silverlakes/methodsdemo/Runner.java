package com.silverlakes.methodsdemo;

import com.silverlakes.formulae.Area;
import com.silverlakes.formulae.Volume;

public class Runner {

	public static void main(String[] args) {
		
		
		//allocate memory for all non-static variable and methods
		Area obj=new Area(); 
		
		double result = Area.areaOfCircle(10);
		System.out.println(result);

		result = Area.areaOfCircle(10.5);
		System.out.println(result);

		double output = obj.areaOfRectangle(10, 10);
		System.out.println(output);
		
		double output1=Area.areaOfTriangle(25, 1);
		System.out.println(output1);
		
		System.out.println(Area.areaOfTriangle(25, 1));
		
		double res=Math.sqrt(64);
		System.out.println(res);
		
		res= Math.max(20, 20.5);
		System.out.println(res);
		
		res=Math.pow(2, 3);
		System.out.println(res);
		
		System.out.println(Math.PI);
		
		String myName=obj.getAuthorName();
		System.out.println(myName);
		
		System.out.println("hello");
		
		Area.quit();
		
	
//		Volume.VolumeofSpere();
//		
//		Volume vol=new Volume();
//		vol.VolumeofCyclinder();
		
		
	}
}
