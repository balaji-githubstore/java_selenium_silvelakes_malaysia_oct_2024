package com.silverlakes.print;

import java.util.ArrayList;
import java.util.List;

public class Demo2Datatypes {

	public static void main(String[] args) {

		//array - size is fixed
		// 10,20,30,40
		int[] arr = new int[4]; // 4*32 bits of memory
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		
		double[] arr1=new double[2];
		
		arr1[0]=33.4;
		arr1[1]=2.2;
		
		String[] colors=new String[3];	
		colors[0]="red";
		colors[1]="yellow";
		colors[2]="green";
		
		colors[2]="";
		System.out.println(colors.length);
		System.out.println(colors[2]);
		
		String[] arr5= {"cow","monkey","dog"};
		
		System.out.println(arr5[2]);
		
		//collection - size is dynamic
		List<String> fruits=new ArrayList<String>();
		
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("peach");
		fruits.add("orange");
		fruits.add("orange");		
		System.out.println(fruits);
		
		System.out.println(fruits.size());
		
		fruits.remove("mango");
		
		System.out.println(fruits);
		
		System.out.println(fruits.get(2));  //get the item from array
		
		
	}

}
