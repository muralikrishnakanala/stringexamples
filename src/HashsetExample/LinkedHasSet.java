package HashsetExample;

import java.util.LinkedHashSet;

public class LinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet lh= new LinkedHashSet();
		lh.add("murali");
		lh.add("pradeep");
		lh.add("dileep");
		lh.add("muralikrishna");
		lh.add("venkat");
		lh.add(null);
		lh.add("10");
		System.out.println(lh);
		/*System.out.println("size of the array:"+lhas.size());*/
		lh.remove("dileep");
		System.out.println(lh);
		
		
		
	}

}
