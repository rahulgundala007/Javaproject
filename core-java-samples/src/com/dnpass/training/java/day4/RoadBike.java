package com.dnpass.training.java.day4;

import java.util.Objects;

public class RoadBike extends Bicycle{
	private int tireWidth;
	/*static 
	{
		System.out.println("static block is called");
	}
	{
		System.out.println("instance block called");
	}*/
	

	public RoadBike(int startCadence, int startSpeed, int startGear,int newTireWidth) {
		super(startCadence, startSpeed, startGear);
		this.setTireWidth(newTireWidth);
	}


	public int getTireWidth() {
		return this.tireWidth;
	}


	public void setTireWidth(int newtireWidth) {
		this.tireWidth = newtireWidth;
	}
	public void printDiscription() {
		super.printDiscription();
		System.out.println("The RoadBike"+"has"+getTireWidth()+"MM tires.");
	}

}