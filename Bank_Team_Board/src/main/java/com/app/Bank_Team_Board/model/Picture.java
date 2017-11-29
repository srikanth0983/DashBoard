package com.app.Bank_Team_Board.model;

public class Picture {

	private String thumbnail;

	
	public Picture() {
	}

	public Picture(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	@Override
	public String toString() {
		return "picture [thumbnail=" + thumbnail + "]";
	}
	
	
}
