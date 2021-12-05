package com.dnpass.training.java.day6;
import java.util.*;
public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Select the shape from below : \n 1:Circle \n 2:Square  \n 3:Rectangel");
		System.out.println("enter the shape:");
		String select = sc.nextLine();
		if(select.equals("Circle")) {
			
			System.out.println("enter the radius");
			float radius = sc.nextFloat();
			Circle c = new Circle(select,radius);
			c.CalculaterArea();
			
		}
		if(select.equals("Square")) {
		
			System.out.println("enter the side");
			double side = sc.nextDouble();
			Square s = new Square(select,side);
			s.CalculaterArea();
		}
		if(select.equals("Rectangle")) {
			
			System.out.println("enter the length and breath");
			double length = sc.nextDouble();
			double breath = sc.nextDouble();
			Rectangle r = new Rectangle(select,length,breath);
			r.CalculaterArea();
		}
		sc.close();
		
		
		

	}

}
