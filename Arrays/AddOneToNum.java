/**
 * 
 */
package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * @author mkunaparaju
 *
 */
public class AddOneToNum {

	
	//doesnt work for biiiiiig numbers
	//implement carry method
	
	
	public static void main(String[] args) {
		ArrayList<Integer> init = new ArrayList<Integer>();
		//init.add(0);
		init.add(9);
		init.add(9);
		init.add(1);
		
		AddOneToNum a = new AddOneToNum();
		
		ArrayList<Integer> init2 = a.plusOne(init);
		
		for( int i = 0; i< init2.size(); i++){
			System.out.print(init2.get(i) + " " );
		}
	}
	
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int number = 0; 
		int multiple = (int) Math.pow(10, a.size() - 1);
		for( int i = 0; i< a.size() ; i++) {
			number = number + (a.get(i) * multiple);	
			multiple = multiple / 10; 
		}
		int newNum = number + 1;
		//System.out.println(newNum);
		
		
		
		ArrayList<Integer> createNum = new ArrayList<Integer>();
		ArrayList<Integer> createNumRev = new ArrayList<Integer>();
		int divisor = 10;

		while(newNum > 0) {
			int digit =  (newNum % divisor);
		   // System.out.println(digit);
			createNum.add( digit);
			newNum = newNum / 10;
			//divisor = divisor * 10; 
		}
		
		for( int i = 0; i < createNum.size(); i++) {
			createNumRev.add(createNum.get(createNum.size() - 1 - i));
		}
		
		return createNumRev;
	}

}
