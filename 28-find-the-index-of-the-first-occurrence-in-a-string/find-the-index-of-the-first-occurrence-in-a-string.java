class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        int i=0;
        int j=0;
        int ans=-1;
        int itr=0;
        while(i<m){
            char x=haystack.charAt(i);
            char y=needle.charAt(j);
            if(x==y && j<n){
                i++;
                j++;
                // System.out.println(x+" "+y);
            }

            if(x!=y){
                // if(j>0){
                //     j--;
                // }
                // else{
                    // System.out.println(x+" "+y);
                    j=0;
                    itr++;
                    i=itr;
                    continue;
                // }
            }
            // if(x!=y && j==0){
            //     i++;
            // }
            if(x==y && j==(n)){
                ans=itr;
                break;
            }




        }
        return ans;
    }
}