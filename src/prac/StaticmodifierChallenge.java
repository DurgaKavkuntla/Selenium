package prac;

import java.util.Scanner;

public class StaticmodifierChallenge {

	static{
	    Scanner inp = new Scanner(System.in);
	    int in1=inp.nextInt();
	     int in2=inp.nextInt();
	    
	    if(in1>0 && in2>0){
	        System.out.println(in1*in2);
	        
	    }
	    else
	    {
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	    
	    inp.close();
	}

	public static void main(String[] args) {
		
	}
}
