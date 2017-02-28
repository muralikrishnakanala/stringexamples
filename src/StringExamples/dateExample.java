package StringExamples;


import java.text.SimpleDateFormat;

public class dateExample {
	public static void main(String[] args) {
     java.util.Date  date = new java.util.Date();
		String strDateformte = "hh:mm:ss a";
		SimpleDateFormat sdf= new SimpleDateFormat(strDateformte);
		System.out.println(sdf.format(date));
		
		
		
	}

}
