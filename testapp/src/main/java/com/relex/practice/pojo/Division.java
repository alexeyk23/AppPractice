package com.relex.practice.pojo;
import javax.persistence.*;
@Entity
@Table(name="Division")
public class Division 
{
	@ManyToOne
	@JoinColumn(name="Company_id")
	private Company company;
	
	@Column(name="Div_name")
	private String divName;
	
	@Id
	@Column(name="Div_id")
	private int divID;
	
	public Division() {
		
	}

	public Company getCompid() {
		return company;
	}

	public void setCompid(Company company) {
		this.company = company;
	}

	public String getDivName() {
		return divName;
	}

	public void setDivName(String divName) {
		this.divName = divName;
	}

	public int getDivID() {
		return divID;
	}

	public void setDivID(int divID) {
		this.divID = divID;
	}
	
	
}
