package ArrayList;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
public static void main(String[] args) {
	int [] array  = {1,2,3,2,5,3,4,5,6,7};
	Set<Integer> set = new HashSet<Integer>();
	 for(int i=0;i<array.length;i++){
		 /* if same integer already present add method will be false*/
		 if(set.add(array[i])== false){
			 System.out.println("Duplicate Element Found:"+ array[i]);
			 
		 } 
	 }	
   }
}
