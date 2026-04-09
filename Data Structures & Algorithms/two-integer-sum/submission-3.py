class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = dict({})
        dc = []
        for i in range(len(nums)):
            if (target - nums[i]) in result:
                dc.append(result.get(target-nums[i]))
                dc.append(i)
                return dc
            result[nums[i]]=i
        return dc
        