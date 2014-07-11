package com.relex.practice.pojo;

@Entity
@Table(name="Division")
public class Division 
{
	@Id
	@Column(name="Company_id")
	private int compid;
	@DivName
	@Column(name="Div_name")
	private String divName;
	
	@DivId
	@Column(name="Div_id")
	private int divID;
	
	public Division() {
		
	}

	public int getCompid() {
		return compid;
	}

	public void setCompid(int compid) {
		this.compid = compid;
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
