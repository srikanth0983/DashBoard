package org.koushik.javabrains.messenger.model;

public class name {
	
	private String title;
	private String first;
	private String last;
	
	public name() {
	}

	public name(String title, String first, String last) {
		this.title = title;
		this.first = first;
		this.last = last;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	

}
