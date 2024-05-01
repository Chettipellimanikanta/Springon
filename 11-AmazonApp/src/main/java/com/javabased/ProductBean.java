package com.javabased;

public class ProductBean {
private int pId;
private String pName;
private int quantity;
private double price;
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public ProductBean(int pId, String pName, int quantity, double price) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.quantity = quantity;
	this.price = price;
}
public ProductBean() {
	super();
	// TODO Auto-generated constructor stub
}
public void printproduct()
{
	double total=price+quantity;
	System.out.println("Total :"+ total);
	double discount=0.0;
	if(total<3000)
	{
		discount=(total*10)/100;
	}
	else if(total>=3000&&total<1000)
	{
		discount=(total*15)/100;
	}
	else
	{
		discount=(total*20)/100;
		System.out.println("Discount :"+ discount);
	}
	double invoice=total-discount;
	System.out.println("invoice :"+invoice);
}
}
