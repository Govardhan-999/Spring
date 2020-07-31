package com.nt.bo;

public class EmployeeBO {
	private String eName;
	private String eAdd;
	private int eId;
	private float eBasicSalary;
	private float eGroasssalary;
	private float eNetSalary;
	
//(S&G methods)Alt+Shift+s,r
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

	public float geteGroasssalary() {
		return eGroasssalary;
	}

	public void seteGroasssalary(float eGroasssalary) {
		this.eGroasssalary = eGroasssalary;
	}

	public float geteNetSalary() {
		return eNetSalary;
	}

	public void seteNetSalary(float eNetSalary) {
		this.eNetSalary = eNetSalary;
	}

}
