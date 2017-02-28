package Corejava;

import java.util.Scanner;

public class PalindromeForString {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner scan =new Scanner(System.in);
	    String str =scan.nextLine();
		StringBuffer strone = new StringBuffer(str);
		StringBuffer strtwo= new StringBuffer(strone);
		strone.reverse();
		System.out.println("Original String="+strtwo);
		System.out.println("After reverse="+strone);
		if(String.valueOf(strone).compareTo(String.valueOf(strtwo))==0)
		System.out.println("It is palindrome");
		else
			System.out.println("It is not a palindrome");	
	}

}
