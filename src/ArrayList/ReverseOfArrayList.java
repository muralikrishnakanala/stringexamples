package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfArrayList {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add("A");
		arraylist.add("B");
		arraylist.add("C");
		arraylist.add("D");
		arraylist.add("E");
		System.out.println("Before Reverse Order"+ arraylist);
		Collections.reverse(arraylist);
		System.out.println("After Reverse order"+ arraylist);
		
	
		
	}

}
