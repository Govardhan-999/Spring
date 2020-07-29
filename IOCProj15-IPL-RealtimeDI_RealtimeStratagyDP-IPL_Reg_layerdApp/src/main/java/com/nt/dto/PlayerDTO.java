package com.nt.dto;

public class PlayerDTO {
	private String pName;
	private String pCountry;
	private int pInnings;
	private int pRunsScored;
	private int pRunsConceded;
	private int pnoOfNotOuts;
	private int pwktsTaken;
	//Alt +Shift+S,r(S&G methods)
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCountry() {
		return pCountry;
	}
	public void setpCountry(String pCountry) {
		this.pCountry = pCountry;
	}
	public int getpInnings() {
		return pInnings;
	}
	public void setpInnings(int pInnings) {
		this.pInnings = pInnings;
	}
	public int getpRunsScored() {
		return pRunsScored;
	}
	public void setpRunsScored(int pRunsScored) {
		this.pRunsScored = pRunsScored;
	}
	public int getpRunsConceded() {
		return pRunsConceded;
	}
	public void setpRunsConceded(int pRunsConceded) {
		this.pRunsConceded = pRunsConceded;
	}
	public int getPnoOfNotOuts() {
		return pnoOfNotOuts;
	}
	public void setPnoOfNotOuts(int pnoOfNotOuts) {
		this.pnoOfNotOuts = pnoOfNotOuts;
	}
	public int getPwktsTaken() {
		return pwktsTaken;
	}
	public void setPwktsTaken(int pwktsTaken) {
		this.pwktsTaken = pwktsTaken;
	}
	 

}
