class Solution {
    public String removeOuterParentheses(String s) {
        String s1="";
        int rem=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='('){
                    if(rem>0){
                        s1+=x;
                    }
                    rem++;
            }
            else{
                rem--;
                if(rem>0){
                    s1+=x;
                }
            }
        }
        return s1;
    }
}