package com.silverlakes.formulae;

public class Area {
	
	public static double areaOfCircle(double radius)
	{
		return Math.PI*radius*radius;
	}
	
	public double areaOfRectangle(double length,double width)
	{
		return length*width;
	}
	
	//areaOfTriangle()
	public static double areaOfTriangle(double base,double height)
	{
		return (base*height)/2;
	}
	
	public String getAuthorName()
	{
		return "Balaji Dinakaran";
	}
	
	public static void quit()
	{
		
	}
	
}
