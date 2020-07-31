package com.nt.dto;

public class EmployeeDTO {

	private String eName;
	private String eAdd;
	private int eId;
	private float eBasicSalary;

//Alt+shift+s,r(S&G methods)
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteAdd() {
		return eAdd;
	}

	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public float geteBasicSalary() {
		return eBasicSalary;
	}

	public void seteBasicSalary(float eBasicSalary) {
		this.eBasicSalary = eBasicSalary;
	}

}
