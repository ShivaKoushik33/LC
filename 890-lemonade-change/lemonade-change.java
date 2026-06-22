class Solution {
    public boolean lemonadeChange(int[] bills) {
        int a[]=new int[3];
        for(int i=0;i<3;i++){
            a[i]=0;
        }

        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                a[0]+=1;
            }
            else if(bills[i]==10){
                if(a[0]>0){
                    a[0]-=1;
                    a[1]+=1;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(a[1]>0 && a[0]>0){
                    a[1]-=1;
                    a[0]-=1;
                    a[2]+=1;
                }
                else if(a[0]>=3){
                        a[0]-=3;
                        a[2]+=1;
                }
                else{
                    return false;
                }
            }
        }

        return true;
    }
}