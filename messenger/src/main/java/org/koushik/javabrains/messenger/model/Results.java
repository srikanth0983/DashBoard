
	 package org.koushik.javabrains.messenger.model;

	 import java.util.Date;

	 import javax.xml.bind.annotation.XmlRootElement;

	 @XmlRootElement
	 public class Results {

	 	private name name;
	 	private String message;
	 	private String timestamp;
	 	private String likes;
	 	private picture picture;
	 	
	 	
		public Results() {
		}

		public Results(org.koushik.javabrains.messenger.model.name name, String message, String timestamp, String likes,
				org.koushik.javabrains.messenger.model.picture picture) {
			this.name = name;
			this.message = message;
			this.timestamp = timestamp;
			this.likes = likes;
			this.picture = picture;
		}
		
		public name getName() {
			return name;
		}
		public void setName(name name) {
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
		public String getLikes() {
			return likes;
		}
		public void setLikes(String likes) {
			this.likes = likes;
		}
		public picture getPicture() {
			return picture;
		}
		public void setPicture(picture picture) {
			this.picture = picture;
		}
	 	
	 	
	 	
	 }
