package TreeSetExample;

import java.util.Iterator;

public class TreeSet {
	public static void main(String[] args) {
		java.util.TreeSet<String>ts= new java.util.TreeSet<String>();
		ts.add("ajay");
		ts.add("balu");
		ts.add("dolly");
		ts.add("jaswanth");
		ts.add("c");
		ts.add("murali");
		Iterator<String> itr= ts.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


	}

}
