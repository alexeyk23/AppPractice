package com.relex.practice.pojo;

import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="Application")

public class Application {
	@Id
	@Column(name= "Application_Id")
	private int id;
	
	@Column(name="App_Name")
	private String name;	
	
	@ManyToMany
	@JoinTable(name="Application_Privileges",
	joinColumns= {@JoinColumn(name = "Application_Id")},
	inverseJoinColumns={@JoinColumn(name = "Privileges_Id")})	
	private Set<Privileges> applications;



public Set<Privileges> getApplications() {
		return applications;
	}

	public void setApplications(Set<Privileges> applications) {
		this.applications = applications;
	}

public Application(){};

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
} 
	


}

