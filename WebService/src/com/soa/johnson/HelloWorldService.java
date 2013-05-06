package com.soa.johnson;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = Style.RPC)
public class HelloWorldService {
	@WebMethod
	public String sayHello(String name) {
		return "hello" + name;
	}

	public static void main(String[] args) {
		HelloWorldService sv = new HelloWorldService();
		String url = "http://localhost:9090/helloworldsv";
		Endpoint.publish(url, sv);
	}
}
