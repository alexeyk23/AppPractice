package com.relex.practice.pojo;





@Entity
@Tabe(name="Application")

public class Application {
	@Id
	@Column(name= "Application_Id")
	private int id;
	
	@Column(name="App_Name")
	private String name;
	
	
	@ManyToMany
	@JoinTable(name="Application_Privileges",
	joinColumns= {@joinColumns(name = "Application_Id")},
	inverseJoinColumns={@JoinColumns(name = "Privileges_Id")}
	
	private Set<Privileges> applications;



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

