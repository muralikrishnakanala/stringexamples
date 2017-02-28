package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMaxmMin {
	public static void main(String[] args) {
		Integer [] number = {1,2,4,8,11,9};
		int min = Collections.min(Arrays.asList(number));
		int max =  Collections.max(Arrays.asList(number));
		System.out.println("Min number" + min);
		System.out.println("Max number" + max);
				
	
	}

}
