package com.soa.johnson.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.soa.johnson.domains.Order;

@WebService
public interface OrderProcess {
	@WebMethod
	String processOrder(Order order);
}
