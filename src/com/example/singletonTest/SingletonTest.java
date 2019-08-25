package com.example.singletonTest;

import java.lang.reflect.Constructor;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		MySingleton instanceOne = MySingleton.getInstance();
		
		MySingleton instanceTwo = null;

		try {
            Constructor[] constructors = MySingleton.class.getDeclaredConstructors();
            
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (MySingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
        }
		
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());//Different instance, not a pure singleton when used Reflection technique
        
        
        
        
        EnumSingleton s1 = EnumSingleton.INSTANCE;
		
		s1.getMessage();
		
		EnumSingleton s2 = null;
		
        try {
            Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
            
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                s2 = (EnumSingleton) constructor.newInstance();
                s2.getMessage();
                break;
            }
        } catch (Exception e) {
        }
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());// EnumSingleton is a pure Singleton. Hence cloning is not allowed.
        
    }
	
}

