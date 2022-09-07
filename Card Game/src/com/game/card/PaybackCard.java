package com.game.card;

public class PaybackCard extends Card {
	int pointsEarned;
	double totalAmount;
	
	public PaybackCard() {
		System.out.println("Default Constructor");
	}
	
	public PaybackCard(int pointsEarned, double totalAmount) {
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

	public PaybackCard(String holderName, String cardNumber, String expiryDate,int pointsEarned, double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}

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
	
	public void display() {
		System.out.println(" | Card Holder Name = " + holderName + " | Card Number = " + cardNumber + " | Expiry Date = " + expiryDate + " | Points Earned = " + pointsEarned + " | Total Amount = " + totalAmount + " |" );
	}

}
