package com.app.Bank_Team_Board.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Post {

	private Profile name;
	private String message;
	private String timestamp;
	private int likes;
	private Picture picture;
	
	public Post(Profile name, String message, String timestamp, int likes, Picture picture) {
		this.name = name;
		this.message = message;
		this.timestamp = timestamp;
		this.likes = likes;
		this.picture = picture;
	}
	public Profile getName() {
		return name;
	}
	public void setName(Profile name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public Picture getPicture() {
		return picture;
	}
	public void setPicture(Picture picture) {
		this.picture = picture;
	}
	
	
	
}
