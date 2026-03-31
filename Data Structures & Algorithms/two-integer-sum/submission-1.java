class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,nums[0]);
        int otherVal=0;
        for(int i=1;i<nums.length;i++){
            if(map.containsValue(target - nums[i])){
                result[1]=i;
                otherVal = target - nums[i];
                break;
            }
            map.put(i,nums[i]);
        }

        for(var entry : map.entrySet()){
            if(entry.getValue().equals(otherVal)){
                result[0] = entry.getKey();
            }
        }
        return result;
    }
}
