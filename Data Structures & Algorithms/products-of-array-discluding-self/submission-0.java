class Solution {
    public int[] productExceptSelf(int[] nums) {   
        //Greedy
        int[] result = new int[nums.length];
        int prod = 1;
        int zeroCount =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                prod = prod*nums[i];
            } else {
                zeroCount++;
            }
        }
        if(zeroCount>1){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            if(zeroCount>0){
                result[i] = (nums[i] == 0) ? prod : 0;
            } else {
                result[i] = prod/nums[i];
            }

        }
        return result;
        
    }
}  
