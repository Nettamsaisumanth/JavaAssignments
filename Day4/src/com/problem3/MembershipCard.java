package com.problem3;

public class MembershipCard extends Card {

	private String holderName;

	public MembershipCard(String holderName, String cardName, String expiryDate, float rating) {
		super(holderName, cardName, expiryDate);
		this.holderName = holderName;
		this.cardName = cardName;
		this.expiryDate = expiryDate;
		this.rating = rating;
	}

	private String cardName;

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	private String expiryDate;
	private float rating;
}
