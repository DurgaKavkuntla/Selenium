package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add(String.valueOf(i));
		}
		
		for(int i=5;i<10;i++){
			list.add(String.valueOf(i));
		}
		int []a1= {1,2,3,4,5};
		
		Arrays.asList(a1);
		
		
		System.out.println(list);
		
		System.out.println(duplicateArray(list));
		
		
	}
	
	static Set<String> duplicateArray(ArrayList<String> dlist){
		
		final Set<String> duplicate = new HashSet<String>();
		
		final Set<String> orig = new HashSet<String>();
		
		for(String e:dlist){
			
			if(!orig.add(e))
				duplicate.add(e);
			else
				orig.add(e);
			
		}
		
		System.out.println(orig);
		return duplicate;
		
	}
}
