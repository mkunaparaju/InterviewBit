/**
 * 
 */
package InterviewBit.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

/**
 * @author mkunaparaju
 *
 */
public class MergeIntervalList {

	 public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
	        if(intervals == null || intervals.size() <= 1)
	            return intervals;
	        Collections.sort(intervals, new IntervalComparator());
	        ArrayList<Interval> result = new ArrayList<Interval>();
	        Interval prev = intervals.get(0);
	        for(int i = 1; i < intervals.size(); i++){
	            Interval current = intervals.get(i);
	            if(prev.end >= current.start){
	                Interval merged = new Interval(prev.start, Math.max(prev.end, current.end));                
	                prev = merged;
	            }
	            else{
	                result.add(prev);
	                prev = current;
	            }
	        }
	        result.add(prev);
	        return result;
	    }
	
}

class IntervalComparator implements Comparator<Interval> {
	public int compare(Interval i, Interval j) {
		return i.start - j.start;
	}
}