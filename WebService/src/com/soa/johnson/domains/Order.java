package com.soa.johnson.domains;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * The @XmlRootElementis part of 
 * the Java Architecture for XML 
 * Binding (JAXB) annotation library*/
@XmlRootElement(name = "Order")
public class Order {
	private String cutomerID;
	private String itemID;
	private int qty;
	private double price;

	public Order() {
	}

	public String getCutomerID() {
		return cutomerID;
	}

	public void setCutomerID(String cutomerID) {
		this.cutomerID = cutomerID;
	}

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
