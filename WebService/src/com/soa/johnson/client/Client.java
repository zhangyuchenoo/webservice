package com.soa.johnson.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soa.johnson.domains.Order;
import com.soa.johnson.server.OrderProcess;

public final class Client {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client() {
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"client-bean.xml");
		OrderProcess server = (OrderProcess) ctx.getBean("orderClient");
		Order order = new Order();
		order.setCutomerID("c001");
		order.setItemID("i001");
		order.setQty(100);
		order.setPrice(200.00);
		String orderID = server.processOrder(order);
		String mess = orderID == null ? "no order" : "orderId is" + orderID;
		System.out.println(mess);
		// System.out.println(ctx.getBean("client"));
		SubClient sub = ctx.getBean("sub", SubClient.class);
		System.out.println(sub.getName() + "\n" + sub.getSubName());
	}
}
