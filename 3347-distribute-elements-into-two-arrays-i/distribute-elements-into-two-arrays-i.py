class Solution:
    def resultArray(self, nums: List[int]) -> List[int]:
        l=[]
        r=[]
        for i in range(0,len(nums)):
            if i==0 :
                l.append(nums[i])
            elif i==1 :
                r.append(nums[i])
            else:
                if l[-1]>r[-1]:
                    l.append(nums[i])
                else :
                    r.append(nums[i])
     
        for i in r:
            l.append(i)
        return (l)
        