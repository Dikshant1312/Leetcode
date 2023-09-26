//Leetcode - 1(TwoSum)
import java.util.Hashtable;
import java.util.Arrays;
class Solution{
public int[] twoSum(int [] nums, int target){
Hashtable<Integer,Integer> numbersFound= new Hashtable<>();
for(int i = 0 ; i < nums.length; i++){
if(numbersFound.containsKey(target - nums[i])){
return new int[]{numbersFound.get(target - nums[i]) , i};
}
numbersFound.put(nums[i],i);
}
return null;
} 
}
/*
This is main method to check the given array
class TwoSum{
public static void main(String [] args){
Solution s = new Solution();
int [] nums = {4, 7, 2, 6};
int target = 9;
int [] A = s.twoSum(nums,target);
System.out.println("Output"+ Arrays.toString(A));
}
}
*/
