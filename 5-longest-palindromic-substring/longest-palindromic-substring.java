class Solution {
    boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }

        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxLen=1;
        String maxString=Character.toString(s.charAt(0));
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if((j-i+1)>maxLen && isPalindrome(s.substring(i,j))){
                    maxLen=(j-i+1);
                    maxString=s.substring(i,j);
                }
            }
        }
        return maxString;
    }
}