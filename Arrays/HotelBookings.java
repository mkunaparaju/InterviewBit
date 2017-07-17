/**
 * 
 */
package InterviewBit.Arrays;
import InterviewBit.Arrays.Interval;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author mkunaparaju
 *
 */
public class HotelBookings {
	class Interval implements Comparable<Interval>{
        int a;
        int d;
        public Interval(int a, int d){
            this.a = a;
            this.d = d;            
        }
        
        public int compareTo(Interval that){
            return this.a - that.a;
        }
        
    }
	public static void main (String [] args) {
		HotelBookings b = new HotelBookings();
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> d = new ArrayList<Integer>();
		
		a.add(1); d.add(10);
		a.add(2); d.add(2);
		a.add(3); d.add(6);
		a.add(4); d.add(14);
		System.out.println(b.hotel(a,d, 2));
		
	}
	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {
	       if(arrive == null || arrive.size() == 0||
	               depart == null || depart.size() == 0 ||
	               depart.size() != arrive.size() || k < 1)
	                return false;
	            Interval[] intervals = new Interval[arrive.size()];
	            for(int i = 0; i < arrive.size(); i++){
	                intervals[i] = new Interval(arrive.get(i), depart.get(i));            
	            }
	            
	            for(int i = 0; i < arrive.size(); i++){
	                System.out.print(intervals[i].a + " ");
	            }
	            System.out.println();
	            for(int i = 0; i < arrive.size(); i++){
	                System.out.print(intervals[i].d + " ");
	            }
	            System.out.println();
	            
	                    
	            Arrays.sort(intervals);
	            System.out.println("After sorting");
	            for(int i = 0; i < arrive.size(); i++){
	                System.out.print(intervals[i].a + " ");
	            }
	            System.out.println();
	            for(int i = 0; i < arrive.size(); i++){
	                System.out.print(intervals[i].d + " ");
	            }
	            System.out.println();
	            
	            int rooms = k;
	            rooms--;
	            for(int i = 1; i < intervals.length; i++){
	                if(rooms > 0){
	                    rooms--;
	                    continue;
	                }
	                else if(intervals[i].a < intervals[i-1].d){
	                    return false;
	                }
	                
	            }
	            
	            
	            return true;
	    		
		
	}
}
	
//	public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int k) {
//		if( arrive.size() == 0 || arrive == null) return (k > 0);
//		else {
//			
//			ArrayList<Interval> bookingInterval = new ArrayList<Interval>();
//			for(int i = 0; i < arrive.size(); i++ ) {
//				Interval interval = new Interval(arrive.get(i), depart.get(i));
//				bookingInterval.add(interval);
//			}
//			int countOverlap = 0;
//			Interval prev = bookingInterval.get(0);
//			for(int i = 1; i < bookingInterval.size(); i++) {
//				Interval curr = bookingInterval.get(i);
//				if(prev.end < curr.start ) {
//					prev = curr; 
//					countOverlap = 0; 
//					continue; 
//				}
//				else {
//					countOverlap++;
//					if(countOverlap >= k) return false;
//					prev = curr; 
//				}
//				
//			}
//		}
//		return true;
//    }
//}
