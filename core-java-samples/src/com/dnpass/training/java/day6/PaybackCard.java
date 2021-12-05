package com.dnpass.training.java.day6;

public class PaybackCard extends Card{
	public PaybackCard(String holderName, String cardNumber, String expiryDate,int pointsEarned,double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		// TODO Auto-generated constructor stub
	}
	private int pointsEarned;
	private double totalAmount;
	public int getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public void printDisplay() {
		System.out.println(holderName +"'s Payback card details : ");
		System.out.println("Card number : "+cardNumber +" \nPoints Earned :"+getPointsEarned()
				+ "\nTotel Amount :"+getTotalAmount());
		
	}
	
}
