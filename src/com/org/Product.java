package com.org;

import java.util.List;

import javax.jws.WebService;

@WebService

public interface Product {
	
	public List<String> getProducts();
	
}
