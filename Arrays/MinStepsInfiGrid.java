package InterviewBit.Arrays;
import java.util.*;
/**
 * @author mkunaparaju
 *
 */
public class MinStepsInfiGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> X = new ArrayList<Integer>();
		ArrayList<Integer> Y = new ArrayList<Integer>();
		
		X.add(4); Y.add(4);
		X.add(8); Y.add(-15);
		X.add(-7); Y.add(-10);
		X.add(-5); Y.add(-3);
		X.add(-13); Y.add(-13);
		X.add(9); Y.add(12);
		X.add(-7); Y.add(8);
		X.add(8); Y.add(-8);
		
		//A : [ 4, 8, -7, -5, -13, 9, -7, 8 ]
		//B : [ 4, -15, -10, -3, -13, 12, 8, -8 ]
		System.out.println(coverPoints(X, Y));
	}
	
	public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
		int startX= X.get(0);
		int startY= Y.get(0);
		int count = 0;
		
		for(int i = 1; i < X.size(); i++) {
			int currX = X.get(i);
			int currY = Y.get(i);
			
			int movement = Math.abs(Math.max(Math.abs(currX - startX), Math.abs(currY - startY)));
			System.out.println(movement + "move");
			count = count + movement;
			System.out.println("count" + count);
			startX = currX;
			startY= currY;
		}
		
		return count; 
	}

	
}



