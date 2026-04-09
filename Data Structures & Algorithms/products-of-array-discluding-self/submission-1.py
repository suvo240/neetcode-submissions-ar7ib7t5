class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        zero_count = 0
        product =1;
       
        for x in nums:
            if x==0:
                zero_count +=1
            else :
                product *= x
        
        for i in range(len(nums)):
            if zero_count >=2:
                nums[i]=0
            elif zero_count == 1:
                if(nums[i]==0):
                    nums[i]=product
                else:
                    nums[i]=0
            else:
                nums[i] = int (product / nums[i])

        return nums

        