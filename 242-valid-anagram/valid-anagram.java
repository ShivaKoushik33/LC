class Solution {
    public boolean isAnagram(String s, String t) {
        int[] x=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            // System.out.println((int)temp-97);
            x[(int)temp-97]++;
        }
        for(int i=0;i<t.length();i++){
              char temp=t.charAt(i);
            //    System.out.println((int)temp-97);
            if(x[(int)temp-97]==0){
                return false;
            }else{
                 x[(int)temp-97]--;
            }
        }
    
        return true;
    }
}