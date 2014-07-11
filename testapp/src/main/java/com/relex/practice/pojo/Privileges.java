package com.relex.practice.pojo;                                                                                  
                                                                                                                  
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;                                                                                       
@Entity                                                                                                           
@Table(name="Privileges")                                                                                   
public class Privileges<Application> 
{                                                                                         
	@Id                                                                                                           
	@Column(name= "Privileges_Id")                                                                                
	private int id;                                                                                              
	                                                                                                              
	@Column(name="Priv_Name")                                                                                     
	private String name;                                                                                          
	                                                                                                              
@ManyToMany(mappedBy="applictions")                                                                               
private Set<Application> applicat = new HashSet<Application>();                                                   
	                                                                                                              
	public Privileges(){};                                                                                        
	                                                                                                              
	public int getId()                                                                                            
	{                                                                                                             
		return id;                                                                                                
	}                                                                                                             
	                                                                                                              
	public String getname()                                                                                       
	{                                                                                                             
		return name;                                                                                              
	}                                                                                                             
	                                                                                                              
	public void setid(int id)                                                                                     
	{                                                                                                             
		this.id=id;                                                                                               
	}                                                                                                             
                                                                                                                  
	public void setname(String name)                                                                              
	{                                                                                                             
		this.name=name;                                                                                           
	}                                                                                                             
	                                                                                                              
	                                                                                                              
	                                                                                                              
}                                                                                                                 
                                                                                                                  