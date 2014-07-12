package com.relex.practice.pojo;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table (name = "Role")
public class Role {
	@Id
	@Column(name = "Role_id")
	private int role_id;
	
	@Column (name = "Role_name")
	private String role_name;
	
	@ManyToMany(mappedBy="roles")
	private Set<User> users = new HashSet<>();
	
	@ManyToMany
	@JoinTable(name = "Role_privileges",
	joinColumns =@JoinColumn(name= "Role_id"),
	inverseJoinColumns =@JoinColumn(name= "Privileges_id"))
	private Set<Privileges> privileges = new HashSet<>();
	
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public int getId()
	{
		return role_id;
	}
	public String getName ()
	{
		return role_name;
	}
	public void setId (int id)
	{
		this.role_id = id;
	}
	public void setName (String name)
	{
		this.role_name = name;
		
	}
	public Role() {
	}
	
}
