import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();
        
        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            int complement = target - num;
            
            if (numIndices.containsKey(complement)) {
                return new int[] { numIndices.get(complement), index };
            }
            
            numIndices.put(num, index);
        }
        
        return new int[0];
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
