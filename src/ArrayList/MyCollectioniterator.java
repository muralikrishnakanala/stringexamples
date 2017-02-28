package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyCollectioniterator {
public static void main(String[] args) {
	List<String> mylist = new ArrayList<>();
	mylist.add("murali");
	mylist.add("leela");
	mylist.add("venkat");
	mylist.add("dileep");
	mylist.add("krishna");
	Iterator<String> itr = mylist.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		
	}
}
}
