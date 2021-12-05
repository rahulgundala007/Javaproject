package com.dnpass.training.java.day4;

public class Bicycle {
	//fields
	private int cadence;
	private int gear;
	private int speed;
	private boolean valid;
	
	
	//The Bicycle class has one const
	public Bicycle(int startCadence,int startSpeed, int startGear) {
		cadence = startCadence;
		gear = startGear;
		speed = startSpeed;
	}
	
	//bicycle four methods
	public void setCadence(int newValue) {
		cadence = newValue;
	}
	public void setGear(int newValue) {
		gear = newValue;
	}
	public void speedUp(int increase) {
		speed += increase;
	}
	public void applyBreak(int decrease) {
		speed -= decrease;
	}
	public void printDiscription() {
		System.out.println("\nBike is " + "in gear " + this.gear + "with a cadence of " + 
				this.cadence + "and travelling at a speed of " + this.speed + ".");
	}
	public int getSpeed() {
		return speed;
		
	}
	
	public int getCadence() {
		return cadence;
	}
	
	
	public int getGear() {
		return gear;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public boolean isValid() {
		return valid;
	}
	
    
}

	
	
	

	