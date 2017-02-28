package Corejava;

public class FibonacciSeries {
	public static void main(String[] args) {
		
	int i ;
	int a=0,b=1,c, count=20;
   System.out.println(a+b);
 for(i=1;i<count;++i){
	  c= a+b;
	  System.out.println(""+ c);   
	  a= b;
	  b= c;
 }
	}

}
