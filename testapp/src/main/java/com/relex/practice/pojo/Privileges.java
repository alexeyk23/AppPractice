package com.relex.practice.pojo;                                                                                  
                                                                                                                  
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;                                                                                       
@Entity                                                                                                           
@Table(name="Privileges")                                                                                   
public class Privileges
{                                                                                         
	@Id                                                                                                           
	@Column(name= "Privileges_Id")                                                                                
	private int id;                                                                                              
	                                                                                                              
	@Column(name="Priv_Name")                                                                                     
	private String name;                                                                                          
	                                                                                                              
	@ManyToMany(mappedBy="applictions")                                                                               
	private Set<Application> applicat = new HashSet<Application>();                                                   
	                   
	@ManyToMany(mappedBy="privileges")
	private Set<Role> roles = new HashSet<>();
	
	public Set<Role> getRoles() {
		return roles;
	}
	public Privileges(){}
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
	public Set<Application> getApplicat() {
		return applicat;
	}
	public void setApplicat(Set<Application> applicat) {
		this.applicat = applicat;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	};    
	
}                                                                                                                 
                                                                                                                  