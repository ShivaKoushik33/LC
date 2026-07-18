class Solution {
     int fn(int i,int j){
        if(j%i==0){
            return i;
        }
        return fn(j%i,i);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        return fn(min,max);

    }
}