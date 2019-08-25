package com.example.singletonTest;

import java.io.Serializable;

public class MySingleton implements Serializable{

	private static final long serialVersionUID = 1L;

	private MySingleton() {
	}

	private static MySingleton instance;

	public static MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				if (instance == null) {
					instance = new MySingleton();
				}
			}
		}
		return instance;
	}
	
	public String getMessage() {
		return "Message ...";
	}
}
