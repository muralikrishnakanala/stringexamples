package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MylisrIterator {
	public static void main(String[] args) {
		List<Integer>list= new ArrayList<Integer>();
		ListIterator<Integer>itr =null;
		list.add(22);
		list.add(222);
		list.add(23);
		list.add(2);
		list.add(21);
		list.add(12);
		list.add(20);
		list.add(26);
	   itr = list.listIterator();
	   System.out.println("elements in forward directions");
	      while(itr.hasNext()){
	      System.out.println(itr.next());
	      }
	      System.out.println("elements in backward directions");
	      while(itr.hasPrevious()){
	    	  System.out.println(itr.previous()); 
	    	  }
	}
}