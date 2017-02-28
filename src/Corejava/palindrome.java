package Corejava;

public class palindrome {
public static void main(String[] args) {
	int r,sum=0,temp;
	int n= 1112111;	
	temp=n;
	while(n>0){	
	r=n%10;
	n= n/10;
	sum = (sum*10)+r;
	}
	if(sum==temp)
		System.out.println("Given number is apalindrome");
	
		else
			System.out.println("Given number is not palindrome");
	}	
		
	}
 

