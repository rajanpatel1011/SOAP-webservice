package com.org;

import javax.xml.ws.Endpoint;

public class ServiceExposer {

	public static void main(String[] args) {
		ImplProduct impl = new ImplProduct();
		Endpoint ep = Endpoint.publish("http://localhost:9191/items", impl);
		System.out.println("Published:"+ep.isPublished());
	}

}
