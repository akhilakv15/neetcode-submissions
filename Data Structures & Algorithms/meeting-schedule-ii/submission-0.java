/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals==null || intervals.size()==0) return 0;
         Collections.sort(intervals, (a,b)->a.start-b.start);
         PriorityQueue<Integer> minheap=new PriorityQueue<>();
        minheap.offer(intervals.get(0).end);

        for(int i=1;i<intervals.size();i++) {
            int currstart=intervals.get(i).start;
            int currend=intervals.get(i).end;

            if(currstart>=minheap.peek()) {
                minheap.poll();
            }
            minheap.offer(currend);
        }


        return minheap.size();

    }
}
