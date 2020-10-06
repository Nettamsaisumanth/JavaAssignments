package com.problem3;

public class PaybackCard extends Card {

	private String holderName;
	private String cardName;
	private float rating;
	protected String expiryDate;
	private float pointsearned;

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

	public PaybackCard(String holderName, String cardName, float rating, String expiryDate, float pointsearned) {
		super(holderName, cardName, expiryDate);
		this.holderName = holderName;
		this.cardName = cardName;
		this.rating = rating;
		this.expiryDate = expiryDate;
		this.pointsearned = pointsearned;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public float getPointsearned() {
		return pointsearned;
	}

	public void setPointsearned(float pointsearned) {
		this.pointsearned = pointsearned;
	}
}
