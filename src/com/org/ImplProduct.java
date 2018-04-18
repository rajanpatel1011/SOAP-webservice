package com.org;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "com.org.Product")
public class ImplProduct implements Product {

	@Override
	public List<String> getProducts() {
		List<String> list = new ArrayList<>();
		list.add("laptop");
		list.add("Mobiles");
		list.add("headphone");
		list.add("Cameras");
		return list;
	}

}
