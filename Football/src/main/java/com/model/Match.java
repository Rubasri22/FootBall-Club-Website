package com.model;

public class Match {
	String title,place,dt;


	public Match(String sr, String place, String dt) {
		super();
		this.title = sr;
		this.place = place;
		this.dt = dt;
	}

	public String getTitle() {
		return title;
	}

	
	public String getPlace() {
		return place;
	}
	
	public String getDt() {
		return dt;
	}
	

}
