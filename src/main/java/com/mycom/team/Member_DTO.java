package com.mycom.team;

public class Member_DTO {
	String id,pw,name,tel,email,address;

public Member_DTO() {}

public Member_DTO(String id, String pw, String name, String tel, String email, String address) {
	super();
	this.id = id;
	this.pw = pw;
	this.name = name;
	this.tel = tel;
	this.email = email;
	this.address = address;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPw() {
	return pw;
}

public void setPw(String pw) {
	this.pw = pw;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


   
}
