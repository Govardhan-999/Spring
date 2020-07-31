package com.nt.vo;

public class EmplpoyeeVO {

	private String eName;
	private String eId;
	private String eAdd;
	private String eBasicSalary;

	// Alt+shift+s,r(S&G methods)
	
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public String geteAdd() {
		return eAdd;
	}

	public void seteAdd(String eAdd) {
		this.eAdd = eAdd;
	}

	public String geteBasicSalary() {
		return eBasicSalary;
	}

	public void seteBasicSalary(String eBasicSalary) {
		this.eBasicSalary = eBasicSalary;
	}

}
