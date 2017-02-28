package LinkedlistExamples;

import java.util.LinkedList;

public class LinkeslistDemo {
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add("murali");
		ll.add("krishna");
		ll.add(10);
		ll.add(null);
		ll.add("murali");
		System.out.println(ll);
		ll.set(0, "Dileep");
		ll.add(0, "leela");
		ll.addFirst("venkat");
		ll.removeLast();
		System.out.println(ll);
		
		
		
		
		
		
	}

}
