package com.excercise.day2;

public class Room {
	private int roomNo;

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public float getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(float roomArea) {
		this.roomArea = roomArea;
	}

	public String getAcMachine() {
		return acMachine;
	}

	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	}

	private String roomType;
	private float roomArea;
	private String acMachine;

	public void setData(int roomNo, String roomType, float roomArea, String acMachine) {
		this.acMachine = acMachine;
		this.roomArea = roomArea;
		this.roomNo = roomNo;
		this.roomType = roomType;
	}

	public void displayData() {
		System.out.println("room no is " + this.roomNo);
		System.out.println("room area is " + this.roomArea);
		System.out.println("room type is" + this.roomType);
		System.out.println("AC Machine type is " + this.acMachine);
	}
}
