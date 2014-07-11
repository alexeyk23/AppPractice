package com.relex.practice.pojo;

import javax.persistence.*;

@Entity
@Table(name="Company")
public class Company 
{
	@Id
	@Column(name="Company_id")
	private int id;	
	
	@OneToMany(mappedBy="")
	@Column (name="Com_name")
	private String name;
	
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
