package com.dnpass.training.java.day4;

public class Room {
	private int roomno;
	private String roomtype;
	private int roomarea;
	private String mechinAC;
	
	public int getRoomno() {
		return roomno;
	}
	
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	
	public String getRoomtype() {
		return roomtype;
		
	}
	
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	
	public int getRoomarea() {
		return roomarea;
	}
	
	public void setRoomarea(int roomarea) {
		this.roomarea = roomarea;
	}
	
	public String getMechinAC() {
		return mechinAC;
	}
	
	
	public void setMechinAC(String mechinAC) {
		this.mechinAC = mechinAC;
	}
	
	public void displayData() {
		System.out.println("the room no is "+ getRoomno() +" Room Type "+ getRoomtype() + " Room area is "
				+ getRoomarea()+" sqt feets "+" AC mechin is "+ getMechinAC());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r1 = new Room();
		r1.setRoomno(21);
		r1.setRoomtype("Single Room");
		r1.setRoomarea(231);
		r1.setMechinAC("LG");
		r1.displayData();

	}

}
