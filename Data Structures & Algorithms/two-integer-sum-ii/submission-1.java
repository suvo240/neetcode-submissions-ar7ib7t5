class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = numbers.length;
        // for(int i=0;i<n;i++){
        //     if(map.containsKey(target - numbers[i])){
        //         return new int[]{map.get(target - numbers[i])+1,i+1};
        //     }
        //     map.put(numbers[i],i);
        // }
        // return new int[]{};
        int left = 0;
        int right = nums.length - 1;
        while(right>left){
            if(nums[left]+nums[right]==target){
                return new int[]{left+1,right+1};
            } else if (nums[left]+nums[right]>target){
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
}
