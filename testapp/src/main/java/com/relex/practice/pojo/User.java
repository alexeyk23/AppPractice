package com.relex.practice.pojo;

import java.util.Date;



public class User {
	@Id
	@Column(name="Id_user")
	private int id_user;
	@Name
	@Column(name="Name")
	private String name;
	@Surname
	@Column(name="Surname")
	private String surname;
	@Mail
	@Column(name="mail")
	private String mail;
	@Data
	@Column(name="data_reg")
	private Date data;
	@DivId
	@Column(name="Div_id")
	private int div_id;
	
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getDiv_id() {
		return div_id;
	}
	public void setDiv_id(int div_id) {
		this.div_id = div_id;
	}
	
	

}
