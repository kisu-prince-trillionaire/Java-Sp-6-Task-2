package com.game.card;

public class MembershipCard extends Card {
	private int rating;

	public MembershipCard() {
		System.out.println("Default Constructor");
	}
	
	public MembershipCard(int rating) {
		this.rating = rating;
	}

	public MembershipCard(String holderName, String cardNumber, String expiryDate,int rating) {
		super(holderName, cardNumber, expiryDate);
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void display() {
		System.out.println(" | Card Holder Name = " + holderName + " | Card Number = " + cardNumber + " | Expiry Date = " + expiryDate + " | Rating = " + rating + " |" );
	}
	
}
