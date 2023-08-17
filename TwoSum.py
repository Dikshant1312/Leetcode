class Solution:
    def twoSum(self, nums, target):
        num_indices = {}
        
        for index, num in enumerate(nums):
            complement = target - num
            if complement in num_indices:
                return [num_indices[complement], index]
            num_indices[num] = index
        
        return []

# Example usage
nums = [2, 7, 11, 15]
target = 9

# Create an instance of the Solution class
solution = Solution()
result = solution.twoSum(nums, target)
print(result)  # Output: [0, 1]
