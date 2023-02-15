package com.app.centralExcepion;

@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException {
	public ResourceNotFoundException(String msg) {
		super (msg);
	}

}
