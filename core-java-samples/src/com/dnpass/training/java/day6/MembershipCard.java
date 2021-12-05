package com.dnpass.training.java.day6;

public class MembershipCard extends Card {
	private int rating;

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	public MembershipCard(String holderName,String cardName,String expiryDate,String cardDetails, int rating){
		super(holderName,cardName, expiryDate);
		setRating(rating);
		
	}
	public void printDisplay() {
		System.out.println(holderName+"'s Membership acrd details :" );
		System.out.println("Card number :" + cardNumber + "\n Rating :" + getRating());
		
	}

}
