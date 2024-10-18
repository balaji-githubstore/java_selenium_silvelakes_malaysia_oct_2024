package com.silverlakes.inheritance;

class Father {
	public int fAge = 60;

	public Father(int fAge,String fname) {
		this.fAge=fAge;
		System.out.println("father constructor");
	}

	public void fStyle() {
		System.out.println("father style!!!");
	}
}

class Son extends Father {
	public int sAge = 20;

	public Son(int fAge,int sAge,String fName,String sName) 
	{
		super(fAge,fName);
		System.out.println("son constructor");
	}

	public void sStyle() {
//		super.fStyle();
		System.out.println("son style");
	}
}

public class Demo1Inheritance {

	public static void main(String[] args) {

//		Father f = new Father();
//		System.out.println(f.fAge);
//		f.fStyle();

		Son s = new Son(59,17,"deven","keven");
		System.out.println(s.fAge);
		System.out.println(s.sAge);

		s.fStyle();
		s.sStyle();

	}

}
