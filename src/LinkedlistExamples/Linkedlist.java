package LinkedlistExamples;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("murali");
		ll.add("krishna");
		ll.add("kanala");
		ll.add("dileep");
		ll.add("kumar");
		System.out.println(ll);
		System.out.println("size of array list:"+ll.size());
		LinkedList<Integer>ll1 = new LinkedList<Integer>();
		ll1.add(1);
		ll1.add(2);
		ll1.add(2);
		ll1.add(32);
		System.out.println(ll1);
		System.out.println("size of array list is :" + ll1.size());
		
		
	}

}
