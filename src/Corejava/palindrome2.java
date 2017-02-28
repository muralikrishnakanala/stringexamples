package Corejava;

import java.util.Scanner;

public class palindrome2 {
public static void main(String[] args) {
	System.out.println("Enter the number");
	int a,num,r,sum=0;
    Scanner scan = new Scanner(System.in);
	num= scan.nextInt();/*the number variable to check here*/
	r= num;
	while(num>0){	
	a=num%10;
	num= num/10;
	sum = (sum*10)+a;
	}
	if(sum==r)
		System.out.println("Given number is apalindrome");
	
		else
			System.out.println("Given number is not palindrome");
	}	
		
	}
 

