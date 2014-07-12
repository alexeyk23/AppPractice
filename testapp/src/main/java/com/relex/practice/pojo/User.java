package com.relex.practice.pojo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

public class User {
	@Id
	@Column(name="Id_user")	
	private int id_user;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Surname")
	private String surname;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="data_reg")
	private Date data;
	
	@Column(name="Div_id")
	@ManyToOne
	@JoinColumn(name ="Div_id")
	private int div_id;
	
	@ManyToMany
	@JoinTable(name = "User_role",
		joinColumns =@JoinColumn(name= "Id_user"),
		inverseJoinColumns =@JoinColumn(name= "Role_id"))
	private Set<Role> roles = new HashSet<>();
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
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
