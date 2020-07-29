package com.nt.bo;

public class PlayerBO {
	private String pName;
	private String pCountry;
	private int pInnings;
	private double pBattingAvg;
	private double pBowlingAvg;
	//Alt + Shift +s, r(S&G methods)
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
	public double getpBattingAvg() {
		return pBattingAvg;
	}
	public void setpBattingAvg(double pBattingAvg) {
		this.pBattingAvg = pBattingAvg;
	}
	public double getpBowlingAvg() {
		return pBowlingAvg;
	}
	public void setpBowlingAvg(double pBowlingAvg) {
		this.pBowlingAvg = pBowlingAvg;
	}
}
