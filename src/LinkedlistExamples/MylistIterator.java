package LinkedlistExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class MylistIterator {
	public static void main(String[] args) {
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("venkat");
		ll.add("murali");
		ll.add("pradeep");
		ll.add("dilep");
		ll.add("leela");
		/*System.out.println(ll);*/
		ll.add("vivek");
		Iterator<String>litr=ll.iterator();
		while(litr.hasNext()){
			System.out.println(litr.next());

		}
	}

}