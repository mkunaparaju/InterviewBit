package InterviewBit.Arrays;

import java.util.ArrayList;

/**
 * @author mkunaparaju
 *
 */

class Interval{
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}

public class MergeInterval {

	public static void main(String[] args) {
		
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(new Interval());

	}

	public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
		//if given any arbitrary interval
		if(newInterval.start > newInterval.end) {
			int temp = newInterval.end;
			newInterval.end = newInterval.start;
			newInterval.start = temp;
		}
		int size = intervals.size();
		
		if(size == 0 || intervals == null) intervals.add(newInterval);
		 else if(newInterval.start <= intervals.get(0).start){
	            intervals.add(0, newInterval);
	        }
	        else if(newInterval.start >= intervals.get(size-1).start){
	            intervals.add(size, newInterval);
	        }
	        else {
	            for(int i = 0; i < intervals.size()-1; i++){
	                if(intervals.get(i).start < newInterval.start && newInterval.start < intervals.get(i+1).start){
	                    intervals.add(i+1, newInterval);
	                    break;
	                }
	                
	            }
	        }
		
		return merge(intervals);
	}
	
	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		if(intervals.size() <= 1) return intervals;
		
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
