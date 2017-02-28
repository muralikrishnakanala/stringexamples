package Corejava;

import java.io.InputStream;
import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter an Integer");
		Scanner input = new Scanner(System.in);
		 num = input.nextInt();	 
		if(num%2==0){
			System.out.println("Entered number is even");
		}
		 System.out.println("Entered number is odd");
	
	}

	}

