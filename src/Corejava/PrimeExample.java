package Corejava;

import java.util.Scanner;

public class PrimeExample {
	public static void main(String[] args) {
		int temp;
	    boolean isPrime = true;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Entera number for check:");
	    int num= scan.nextInt();
	    for(int i = 2;i<=num/2;i++){
	    	temp=num%i;
	    	if(temp==0){
				isPrime = false;
	    		break;
	    	}
	    	
	    }
	    if(isPrime)
	    	System.out.println("num + is prime number");
	    else
	    	System.out.println("num + is not a prime number");
	    	
	}
}
