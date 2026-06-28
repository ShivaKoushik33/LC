class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0]=1;

        int i=0;
        int n=arr.length;
        for(i=1;i<arr.length;i++){
               arr[i]=Math.min(arr[i],arr[i-1]+1);
        }
      return arr[n-1];
    }
}