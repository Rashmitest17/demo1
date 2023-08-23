package practicetest;

import org.testng.annotations.Test;
import java.util.Scanner;  



public class ReverseString {
	
	//public static void main(String[] args) {
		//Without using revese function
	@Test
	public void String_Reverse(){
	String s="Automation Testing";
		
		System.out.println("Previouse Text of Reverse String==> " +s);
		
		for(int i=s.length();i>0;--i) // i is the length of the string
			
			System.out.println(s.charAt(i-1)); // Printing the Character At Index i-1
		}


	@Test
		public void reverseString() {
		String s;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		s=sc.nextLine();                    //reading string from user  
		System.out.print("After reverse string is: ");  
		for(int i=s.length();i>0;--i)                //i is the length of the string  
		{  
		System.out.print(s.charAt(i-1));            //printing the character at index i-1  
		}  
		
	}
	
}

