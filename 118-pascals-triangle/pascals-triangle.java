class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l=new ArrayList<>();
        // l.add(1);
        for(int i=0;i<numRows;i++){
                List<Integer> temp=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }
                else{
                    temp.add(l.get(i-1).get(j)+l.get(i-1).get(j-1));
                }
            }
            l.add(new ArrayList<>(temp));
        }
        return l;
    }
}