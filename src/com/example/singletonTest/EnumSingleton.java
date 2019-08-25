package com.example.singletonTest;

import java.io.Serializable;

public enum EnumSingleton implements Serializable{

	INSTANCE;
    
    public static void getMessage(){
        System.out.println("EnumSingleton...");
    }
    
}
