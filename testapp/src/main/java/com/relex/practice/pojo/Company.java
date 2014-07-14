package com.relex.practice.pojo;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="COMPANY")
public class Company 
{
	@Id
	@Column(name="COMPANY_ID")	
	private int id;	
	
	@Column (name="COMPANY_NAME")
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
