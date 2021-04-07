package com.model;

import javax.validation.constraints.Min;

//pojo class with required attributes,getters and setters 
public class HotelBean {
	
	private String roomType;
	private double roomCost;
	@Min(value = 1,message = "Number of days should be minimum one")
	private int noOfDays;
	
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomCost() {
		return roomCost;
	}
	public void setRoomCost(double roomCost) {
		this.roomCost = roomCost;
	}

}
