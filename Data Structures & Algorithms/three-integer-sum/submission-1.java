class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // HashSet<List<Integer>> hashSet = new HashSet<>();
        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     HashSet<Integer> set = new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         int target = - (nums[i]+nums[j]);
        //         if(set.contains(target)){
        //             List<Integer> list = new ArrayList<>();
        //             list.add(nums[i]);
        //             list.add(nums[j]);
        //             list.add(target);
                    
        //             Collections.sort(list);
        //             hashSet.add(list);

        //         }
        //         set.add(nums[j]);
        //     }
        // }
        // return new ArrayList<>(hashSet);
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = nums[j]+nums[k]+nums[i];
                if(sum>0){
                    k--;
                } else if (sum<0){
                    j++;
                } else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j=j+1;
                    k=k-1;
                    while(j<n && nums[j]==nums[j-1]){
                        j++;
                    }
                    while(k>0 && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }           
        }
        return result;
    }
}
