package Corejava;

import java.util.Scanner;

public class FindprimeNumber {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
		
		int i=0;
		int num=0;
		String primenumbers="";
		System.out.println("enter the value of n");
		int n= scanner.nextInt();
		
		for(i=0; i<=n; i++) {
			
			 int counter =0;
			 
			 for (num= i; num>=1; num--)	{
				 
				 if(i%num==0){
					 counter= counter +1;
				 } 
			 }
			 if(counter==2){
				 primenumbers= primenumbers + i +"";
			 }
			
		}
		
		System.out.println("primenumbers from 1 to n are:");
		
		System.out.println("primenumbers");
		
		}
	}


