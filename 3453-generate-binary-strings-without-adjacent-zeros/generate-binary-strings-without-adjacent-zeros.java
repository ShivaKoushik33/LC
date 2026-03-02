class Solution {
    void generateBS(boolean flag,List<String> ans,List<Character> temp,int i,int n){
        if(i==n){
            StringBuilder sb=new StringBuilder("");
            for(char x:temp){
                sb.append(x);
            }
            ans.add(sb.toString());
            return;
        }

        if(flag){
            temp.add('0');
            generateBS(!flag,ans,temp,i+1,n);
            temp.remove(temp.size()-1);
            temp.add('1');
            generateBS(flag,ans,temp,i+1,n);
            temp.remove(temp.size()-1);
        }
        else{
            temp.add('1');
            generateBS(!flag,ans,temp,i+1,n);
            temp.remove(temp.size()-1);
        }


    }
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        List<Character> temp=new ArrayList<>();
        generateBS(true,ans,temp,0,n);
        return ans;
    }
}