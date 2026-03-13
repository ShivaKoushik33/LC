class Solution {
    void fn(int ind,int nums[],List<List<Integer>> ans,List<Integer> x){
        // if(ind==nums.length){
            ans.add(new ArrayList<>(x));
            // return ;
        // }
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]){
                continue;
            }
            x.add(nums[i]);
            fn(i+1,nums,ans,x);
            x.remove(x.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> x=new ArrayList<>();
        Arrays.sort(nums);
        fn(0,nums,ans,x);
        return ans;
    }
}