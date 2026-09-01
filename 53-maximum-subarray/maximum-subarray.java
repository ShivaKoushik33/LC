class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int val=0;
        for(int i=0;i<n;i++){
            val+=nums[i];
            ans=Math.max(ans,val);
            if(val<0){
                val=0;
            }
        }
        return ans;
    }
}