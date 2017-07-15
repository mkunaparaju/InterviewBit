/**
 * 
 */
package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mkunaparaju
 *
 */
public class NobleInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

//	 public int solve(ArrayList<Integer> a) {
//		 if(a.size() < 1 || a == null) return -1;
//		 int exist = -1;
//		 Collections.sort(a);
//		 
//		 for(int i = 0; i< a.size() - 1; i++) {
//			 ArrayList<Integer> a2 = new ArrayList<Integer>(a.subList(i+1, a.size() - 1));
//			 if(a.get(i) == a2.size()) exist = 1; 
//			 
//			 
//		 }
//		 return exist;
//	 }
//	 
	
	 public int solve(ArrayList<Integer> arr) {
		 Collections.sort(arr);
		 
	        // Return a Noble element if present
	        // before last.
		 
	        int n = arr.size();
	        for (int i = 0; i < n-1; i++)
	        {
	            if (arr.get(i) == arr.get(i+1))
	                continue;
	 
	            // In case of duplicates, we
	            // reach last occurrence here.
	            if (arr.get(i) == n-i-1)
	                return 1;
	        }
	 
	        if (arr.get(n-1) == 0)
	            return 1;
	 
	        return -1;
	        }
		
	 
	 
}
