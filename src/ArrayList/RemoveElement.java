package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveElement {
	public static void main(String[] args) {
		
		String removeEle = "krishna";
		List<String>mylist = new ArrayList<String>();
		mylist.add("murali");
		mylist.add("dileep");
		mylist.add("venkat");
		mylist.add("leela");
		mylist.add("krishna");
		System.out.println("before remove");
		System.out.println(mylist);
		Iterator<String>itr = mylist.iterator();
		while(itr.hasNext()){
			if (removeEle.equals(itr.next())){
			itr.remove();
			}
		}
			System.out.println("after remove");
			System.out.println(mylist);
			
			}
		
		
	}

