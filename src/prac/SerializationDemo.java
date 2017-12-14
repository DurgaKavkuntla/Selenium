package prac;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {
	transient int a=90;
	static transient String str="hello";
	
	final transient int b=10;
	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("demo data");
		
		ObjectOutputStream oos= new ObjectOutputStream(fs);
		
		SerializationDemo demo= new SerializationDemo();
		
		oos.writeObject(demo);
		
		oos.close();
		
		
		
		
	}

}
