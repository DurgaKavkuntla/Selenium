package prac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis= new FileInputStream("demo data");
		ObjectInputStream oos = new ObjectInputStream(fis);
		Object o= oos.readObject();
		SerializationDemo d = (SerializationDemo)o;
		
		System.out.println(d.a);
		
		System.out.println(d.b+"............---"+d.str);
	}

}
