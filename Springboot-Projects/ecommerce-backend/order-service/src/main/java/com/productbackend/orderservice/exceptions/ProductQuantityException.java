package com.productbackend.orderservice.exceptions;

public class ProductQuantityException extends RuntimeException {

	public ProductQuantityException(String message) {
		super(message);
	}
}
