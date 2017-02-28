package TreeSetExample;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {	
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(20);
		t.add(20);
		t.add(2);
		t.add(22);
		t.add(14);
		t.add(32);		
	System.out.println(t);	
		
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		
		Integer i1 = (Integer)obj1;	/*because we are passing integer values that why we are typecast here integers */
		Integer i2 = (Integer)obj2;/*because we are passing integer values that why we are typecast herers intege */ 
		if(i1<i2)
			return +1;
		else if(i1>i2)
		  return  -1;
		else
			return 0;	
		
		
	}
}
	
