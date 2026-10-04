class Solution {
    Boolean dp[][];
    public boolean fn(int i,String s,int balance){
        if(i>s.length() || balance<0){
            return false;
        }
        if(i==s.length()){
            return 0==balance;
        }
        if(dp[i][balance]!=null){
            return dp[i][balance];
        }
        char x=s.charAt(i);
        if(x=='('){
            return dp[i][balance]=fn(i+1,s,balance+1);
        }
        else if(x==')'){
            return dp[i][balance]=fn(i+1,s,balance-1);
        }
        else{
            return dp[i][balance]=fn(i+1,s,balance+1) || fn(i+1,s,balance-1) || fn(i+1,s,balance);
     
        }
    }

       

    
    public boolean checkValidString(String s) {
        //  int count=0;
        //     int star=0;
        // for(int i=0;i<s.length();i++){
        //     char x=s.charAt(i);
           
        //     if(x=='('){
        //         count++;
        //     }
        //     else if(x==')'){
        //         count--;
        //     }
        //     else{
        //         star++;
        //     }
        // }
        // if(count>star){
        //     return false;
        // }
        // return true;
        dp=new Boolean [s.length()][s.length()+1];
        return fn(0,s,0);
    }
}