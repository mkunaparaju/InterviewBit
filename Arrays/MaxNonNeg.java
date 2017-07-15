/**
 * 
 */
package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * @author mkunaparaju
 *
 */
public class MaxNonNeg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> in = new ArrayList<>();
		in.add(0);
		//in.add(0);
	///	in.add(-1);
	//	in.add(0);
//		in.add(-2);
	//	in.add(-3);
		
		System.out.println("priting array");
		MaxNonNeg m = new MaxNonNeg();
		ArrayList<Integer> maxArr = m.maxset(in);
		
		for(int i = 0; i < maxArr.size(); i++) {
			System.out.print(maxArr.get(i) + " ");
		}

	}
	
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		
		if(a ==  null || a.size() < 1 ) {
			return a;
		}
		ArrayList<ArrayList<Integer>> listPosArr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> posArr = new ArrayList<Integer>();
		int index = 0;
		if(a.get(index) >= 0) posArr.add(a.get(index));
		while(index < a.size()) {
		
			if(a.get(index) >= 0) {
				posArr.add(a.get(index));
				index ++;
			}
			else {
				
				if(posArr.size() != 0 || posArr != null) {
					listPosArr.add(posArr);
				}
				
				posArr = new ArrayList<Integer>();
				index++;
			}
		}
		System.out.println(listPosArr.size());
		ArrayList<Integer> maxArr = getMaxNonNegArr(listPosArr);
		//System.out.println(maxArr.get(0));
		return maxArr;
	}

	public ArrayList<Integer> getMaxNonNegArr(ArrayList<ArrayList<Integer>> listPosArr) {
		if(listPosArr == null || listPosArr.size() < 1)  return null;
		
		if(listPosArr.size() == 1) return listPosArr.get(0);
		
		ArrayList<Integer> maxArr = new ArrayList<Integer>();
		int maxSum = 0;
		
		for( int i = 0; i < listPosArr.size(); i++ ) {
			
			ArrayList<Integer> pres = listPosArr.get(i);
			if(pres.isEmpty()) continue; 
			int sum = sumElems(pres);
			
			if(sum > maxSum) maxArr = pres;
			
			else if (sum == maxSum ) {
				if(maxArr.get(0) > pres.get(0)) maxArr = pres;
			}
			
		}
		
		return maxArr;
	}
	
	public int sumElems(ArrayList<Integer> in) {
		int sum = 0; 
		for(int i = 0; i < in.size(); i++ ) {
			sum = sum + in.get(i);
		}
		return sum;
	}
}
