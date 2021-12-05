package com.dnpass.training.java.day6;
public abstract class Card{
	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Card(String holderName,String cardNumber,String expiryDate) {
		setHolderName(holderName);
		setCardNumber(cardNumber);
		setExpiryDate(expiryDate);
		
	}
}