package com.productbackend.orderservice.exceptions;

public class ProductNotFoundException extends RuntimeException {
	
	public ProductNotFoundException(String message) {
		super(message);
	}
}
