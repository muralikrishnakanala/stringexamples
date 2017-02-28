package Corejava;

public class fibonacciSeries2 {
	public static void main(String[] args) {
		int a,b,c;
		for(a=0,b=1,c=0;c<=1000;c=a+b){
		System.out.println(""+c);
		
			a=b;
			b=c;	
		}		
	}
}
