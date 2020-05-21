package com.xiang.fz.bean;

public class Address {
	private String province;
    private String city;
    private String town;
    
	@Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + ", town=" + town + "]";
	}
	private Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Address(String province, String city, String town) {
		super();
		this.province = province;
		this.city = city;
		this.town = town;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
    
}
