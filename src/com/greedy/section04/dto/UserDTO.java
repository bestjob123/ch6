package com.greedy.section04.dto;

public class UserDTO {

	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;
	
	public UserDTO() {}
	
	public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
		this.id = id;
		this.pwd =pwd;
		this.name = name;
		this.enrollDate = enrollDate;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEnrollDate(java.util.Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public java.util.Date getEnrollDate(){
		return enrollDate;
	}
	
	public String getInformation() {
		return "UserDTO [id=" + this.id 
				+", pwd ="+this.pwd +",name=" 
				+ this.name+",enrollDate="
				+this.enrollDate
				+"]";
	}
}
