package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.bson.codecs.CollectibleCodec;

public class Swapwithout {
	
// Swap value not using without third variable 
	public void swap2(int a, int b) {


		System.out.printf("\n Swap Value is A ==> " +a);
		System.out.printf("\n Swap Value is B ==> " +b);		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.printf("\n Swap Value is A ==> " +a);
		System.out.printf("\n Swap Value is B ==> " +b);		

	}
	

	public void swapcollection() {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		System.out.println("\n Before Swap==>" +list);
		
		Collections.swap(list,1,2);
		
		System.out.println("After Swap==>" +list);
		
		
		
		
		
		
		
	}
	
	
	
public void swapString() {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("JAVA");
		list.add(".NET");
		list.add("PHP");
		list.add("Nodejs");
		list.add("Cypress");
		list.add("C#");
		
		System.out.println("Before List of Array===>"+list.size());
		
		System.out.println("\n Before Swap==>" +list);
		
		list.remove(3);
		
		System.out.println("\n Before Swap==>" +list);
		
		System.out.println(list.size());
		
		Collections.swap(list,1,2);
		
		System.out.println("After Swap==>" +list);
		System.out.println(list.size());
			
	}
	public static void main(String[] args) {
		Swapwithout obj = new Swapwithout();
		obj.swap2(10, 20);
		obj.swapcollection();
		obj.swapString();
	}
	
}
