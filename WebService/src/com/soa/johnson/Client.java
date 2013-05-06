package com.soa.johnson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class Client {
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
	}
}
