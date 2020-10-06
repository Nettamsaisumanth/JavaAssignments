package com.problem3;

public abstract class Card {
	protected String holderName;

	public Card(String holderName, String cardName, String expiryDate) {
		this.holderName = holderName;
		this.cardName = cardName;
		this.expiryDate = expiryDate;
	}

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

	protected String cardName;
	protected String expiryDate;

}
