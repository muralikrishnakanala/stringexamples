package StringExamples;

public class StringEquals {
	public static void main(String[] args) {
		String a= "murali";
		String b= "MURALI";
		if(a.equals(b)){
			System.out.println("both are same");
		}
		else{
			System.out.println("both are not equal");
		}
		if(a.equalsIgnoreCase(b)){
			System.out.println("Both are same");
			
		}
		else{
			System.out.println("Both are not equal");
		}
	}
	
	}
