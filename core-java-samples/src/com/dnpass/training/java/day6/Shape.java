package com.dnpass.training.java.day6;

import java.util.Scanner;

public abstract class Shape{
	Scanner sc = new Scanner(System.in);
	protected String name;
	public Shape(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	abstract void CalculaterArea();
	
}
