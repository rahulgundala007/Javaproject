package com.dnpass.training.java.day6;

public class Square extends Shape{
	private double side;
	public Square(String name, double side) {
		super(name);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public void CalculaterArea() {
		
		System.out.println("the area of square "+ (side*side));
	}
	
}
