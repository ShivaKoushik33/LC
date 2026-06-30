// class Solution {
//     // int count;
//     public boolean fn(int index,boolean first ,boolean second,boolean third,String s){
//          boolean ans=(((first)&&(second))&&(third));
//             if(ans){
//                 // count++;
//                 return true;
//             }
//         if(index>=s.length()){
//             return false;
//         }

//         char x=s.charAt(index);
//         if(x=='a'){
//        return fn(index+1,true,second,third,s);
//         }
//         if(x=='b'){
//         return fn(index+1,first,true,third,s);
//         }
//         if(x=='c'){
//         return fn(index+1,first,second,true,s);
//         }
//         return false;
//     }
//     public int numberOfSubstrings(String s) {
//       int count=0;
//         for(int i=0;i<s.length();i++){
//                boolean a = false, b = false, c = false;
//             for(int j=i;j<s.length();j++){
//             //       char ch = s.charAt(j);

//             // if (ch == 'a') a = true;
//             // if (ch == 'b') b = true;
//             // if (ch == 'c') c = true;

//             // if (a && b && c) count++;
//                 String temp=s.substring(i,j+1);
//                  if(fn(0,false,false,false,temp)){
//                     count++;
//                  };

//             }
//         }
//         //  fn(0,false,false,false,s);







        
//          return count;
//     }
// }



class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();

        int[] freq = new int[3];
        int left = 0;
        int ans = 0;

        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                ans += (n - right);
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;
    }
}