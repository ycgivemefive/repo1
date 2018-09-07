package com.yc.bean;

import java.util.Date;

public class MaoBean {
	private int illness;
	private String illinfo;
	private double illprice;
	private Date illdate;
	public int getIllness() {
		return illness;
	}
	public void setIllness(int illness) {
		this.illness = illness;
	}
	public String getIllinfo() {
		return illinfo;
	}
	public void setIllinfo(String illinfo) {
		this.illinfo = illinfo;
	}
	public double getIllprice() {
		return illprice;
	}
	public void setIllprice(double illprice) {
		this.illprice = illprice;
	}
	public Date getIlldate() {
		return illdate;
	}
	public void setIlldate(Date illdate) {
		this.illdate = illdate;
	}
	@Override
	public String toString() {
		return "MaoBean [illness=" + illness + ", illinfo=" + illinfo + ", illprice=" + illprice + ", illdate="
				+ illdate + "]\n";
	}
	
}
