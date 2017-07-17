/**
 * 
 */
package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * @author mkunaparaju
 *
 */
public class FizzBuzz {
	 public ArrayList<String> fizzBuzz(int A) {
		 ArrayList<String> a = new ArrayList<String>();
		    for(int i = 1; i < A; i++ )  {
		    	if (i % 3 == 0) {
		    		if(i % 5 == 0 ) a.add("FizzBuzz");
		    		else a.add("Fizz");
		    	}
		    	else if (i % 5 == 0) a.add("Buzz");
		    	else a.add(Integer.toString(i));
		    }
		    return a;
	 }
}
