package com.example.singletonTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
        EnumSingleton instanceOne = EnumSingleton.INSTANCE;
        
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        EnumSingleton instanceTwo = (EnumSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());// EnumSingleton is a pure Singleton, even works with serialization.
        
        
        MySingleton mySingleton1 = MySingleton.getInstance();
        
        ObjectOutput out2 = new ObjectOutputStream(new FileOutputStream("filename2.ser"));
        out2.writeObject(mySingleton1);
        out2.close();
        
        //deserailize from file to object
        ObjectInput in2 = new ObjectInputStream(new FileInputStream("filename2.ser"));
        MySingleton mySingleton2 = (MySingleton) in2.readObject();
        in2.close();
        
        System.out.println("mySingleton1 hashCode="+mySingleton1.hashCode());
        System.out.println("mySingleton2 hashCode="+mySingleton2.hashCode());//Different instance, not a pure singleton when created using Serialization
        
    }
	
}
