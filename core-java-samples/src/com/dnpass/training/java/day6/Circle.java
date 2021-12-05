package com.dnpass.training.java.day6;

public class Circle extends Shape{
	
	private float radius;
	
	
	public Circle(String name,float radius) {
		super(name);
		this.radius=radius;
	
		
		
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
	

	@Override
	public void CalculaterArea() {
		System.out.println("the area of circle "+3.14 *radius*radius);
	
		

		
		
	}
}