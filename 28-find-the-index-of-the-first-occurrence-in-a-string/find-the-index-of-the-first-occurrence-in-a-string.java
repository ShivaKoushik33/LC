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
            }
            if(j==(n)){
                ans=itr;
                break;
            }

            if(x!=y){
                    j=0;
                    itr++;
                    i=itr;
                    continue;
            }
            




        }
        return ans;
    }
}