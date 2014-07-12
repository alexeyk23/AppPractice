package com.relex.practice.pojo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Company")
public class Company 
{
	@Id
	@Column(name="Company_id")	
	private int id;	
	
	@Column (name="Com_name")
	private String name;
	
	@OneToMany(mappedBy="company")
	private Set<Division> divs;
	
	public Company(){}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
