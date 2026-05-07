class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        resultDict = {}

        finalRes = []

        for i in range(len(nums)):
            if (target - nums[i]) in resultDict:
                finalRes.append(resultDict.get(target - nums[i]))
                finalRes.append(i)
            resultDict[nums[i]]=i
        finalRes.sort()
        return finalRes
        