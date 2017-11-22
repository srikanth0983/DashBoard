package org.koushik.javabrains.messenger.model;

public class picture {

	private String thumbnail;

	
	public picture() {
	}

	public picture(String thumbnail) {
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
