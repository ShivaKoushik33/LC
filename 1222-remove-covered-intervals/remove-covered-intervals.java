class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->{
        if(a[0]==b[0]){
            return Integer.compare(b[1],a[1]);
        }
        else{
            return Integer.compare(a[0],b[0]);
        }
       });

        int prev_min=-1;
        int prev_max=-1;
        int count=0;
      for(int x[]:intervals){
        int curr_min=x[0];
        int curr_max=x[1];

        if(curr_min==prev_min){
            count++;
            continue;
        }

        else if(curr_max==prev_max){
            count++;
        }
        else if(curr_min>prev_min && curr_min<prev_max){
            if(prev_max>=curr_max){
                count++;
                continue;
            }
        }

        prev_min=curr_min;
        prev_max=curr_max;
      }
        return intervals.length-count;
       
    }
}