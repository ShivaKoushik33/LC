class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int count=0;
        int ans=0;
       for(int i=0;i<n;i++){
            count=0;
        for(int j=i;j<n;j++){
            if(nums[j]==target){
                count++;
            }
            if(((j-i)+1)<(2*count)){
                ans++;
            }
        }
       } 
       return ans;
    }
}