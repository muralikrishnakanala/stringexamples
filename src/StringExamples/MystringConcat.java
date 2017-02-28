package StringExamples;

public class MystringConcat {
    public static void main(String [] args){
        String b = "jump ";
        String c = "No jump";
      
       /* String d = b+c;
        System.out.println(d);*/
        
       String d = b.concat(c);
        System.out.println(d);
    }
}