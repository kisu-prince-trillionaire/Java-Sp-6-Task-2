package com.game.card;

public abstract class Card {
	protected String holderName;
	protected String cardNumber;
	protected String expiryDate;
	
	public Card() {
		System.out.println("Default Constructor");
	}

	public Card(String holderName, String cardNumber, String expiryDate) {
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
	}

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
	
	public void display() {
		System.out.println(" | Card Holder Name = " + holderName + " | Card Number = " + cardNumber + " | Expiry Date = " + expiryDate + " |" );
	}
}
