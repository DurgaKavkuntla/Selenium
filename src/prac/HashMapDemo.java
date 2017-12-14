package prac;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<String,String> m = new HashMap<>();
		
		m.put("hello", "dummy");
		m.put("a", "b");
		
		m.put("Power", "220");
	    m.put("Type", "2-wheeler");
	    m.put("Price", "85000");
	    
	    Set<Entry<String, String>> mef=m.entrySet();
	    System.out.println(("entry"+mef));
	    Collection<String> a=m.values();
	    System.out.println(a);
	    m.keySet();
	    System.out.println(m);
	    StringBuilder s = new StringBuilder("hellovvv qwfds");
	   StringBuilder rev= s.reverse();
	    
		 System.out.println(rev.toString());
	} 

}
