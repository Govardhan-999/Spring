package com.nt.bo;

public class CustomerBO {
	private String cname;
	private String cadd;
	private float pamt;
	private float intrstAmt;
	//S&G methods (Alt+shift+s,r)
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public float getPamt() {
		return pamt;
	}
	public void setPamt(float pamt) {
		this.pamt = pamt;
	}
	public float getIntrstAmt() {
		return intrstAmt;
	}
	public void setIntrstAmt(float intrstAmt) {
		this.intrstAmt = intrstAmt;
	}
	

}
