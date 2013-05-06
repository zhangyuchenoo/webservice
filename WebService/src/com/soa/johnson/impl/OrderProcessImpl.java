package com.soa.johnson.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soa.johnson.Order;
import com.soa.johnson.OrderProcess;

@WebService
public class OrderProcessImpl implements OrderProcess {

	@Override
	@WebMethod
	public String processOrder(Order order) {
		String orderID = validate(order);
		return orderID;
	}

	private String validate(Order order) {
		String custID = order.getCutomerID();
		String itemID = order.getItemID();
		int qty = order.getQty();
		double price = order.getPrice();
		if (custID != null && itemID != null && !custID.equals("")
				&& !itemID.equals("") && qty > 0 && price > 0.0) {
			return "ORD1234";
		}
		return null;
	}
}
