class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String str:strs){
            char a[]=str.toCharArray();
            Arrays.sort(a);
            String val=new String(a);
            if(hm.containsKey(val)){
                List l=hm.get(val);
                l.add(str);
            }
            else{
                  List<String> temp = new ArrayList<>();
                temp.add(str);
                hm.put(val, temp);
            }
        }
        return new ArrayList<>(hm.values());
    }
}