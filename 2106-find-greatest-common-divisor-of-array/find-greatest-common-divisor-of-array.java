class Solution {
     int fn(int i,int j){
        if(j%i==0){
            return i;
        }
        return fn(j%i,i);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return fn(nums[0],nums[nums.length-1]);

    }
}