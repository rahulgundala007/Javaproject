package com.dnpass.training.java.day4;
import java.util.Objects;

public class MountainBike extends Bicycle {
	private String suspension;
	public MountainBike(int startCadence, int startSpeed, int startGear,String suspensionType) {
		super(startCadence, startSpeed, startGear);
		//Objects.requireNonNull(suspensionType,"suspensionType is null");
		//this.suspension=suspensionType;
		this.setSuspension(suspensionType);
	}

	/**
	 * @return the suspension
	 */
	public String getSuspension() {
		return suspension;
	}

	/**
	 * @param suspension the suspension to set
	 */
	public void setSuspension(String suspension) {
		//Objects.requireNonNull(suspensionType,"suspensionType is null");
		this.suspension = suspension;
	}
	public void printDiscription() {
		super.printDiscription();
		System.out.println("The"+"MountainBike has a"+getSuspension()+"suspension");
	}

}
