package com.dnpass.training.java.day6;

public class Rectangle extends Shape{
	private double length;
	private double breath;
	public Rectangle(String name,double length,double breath) {
		super(name);
		this.length=length;
		this.breath=breath;
	
		
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}

	public void CalculaterArea() {
		
		System.out.println("the area of rectangle: "+(length*breath));
	}
}

