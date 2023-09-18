//LeetCode-189(Rotate Array)
import java.util.Arrays;
class Solution{
public void rotate(int [] nums, int k){
//rotate whole array
//[1,2,3,4,5,6,7] -> [7,6,5,4,3,2,1]
reverse(nums,0,nums.length-1);
//rotate elements till k
//[7,6,5,4,3,2,1] -> [5,6,7,4,3,2,1]
reverse(nums,0,k-1);
//rotate nums.length - k
//[5,6,7,4,3,2,1] -> [5,6,7,1,2,3,4]
reverse(nums,k,nums.length-1);
}
public void reverse(int [] nums, int start, int end){
while(start<end){
int temp = nums[start];
nums[start] = nums[end];
nums[end] = temp;
start++;
end--;
}
}
}
/* 
This is main method just to check the given main method
class RotateArray{
public static void main(String [] args){
Solution s = new Solution();
int [] nums = {1,2,3,4,5,6,7};
int k = 3;

//Array Before Rotation
System.out.println("Before Rotation : "+Arrays.toString(nums));

//Array After Rotation
s.rotate(nums,k);
System.out.println("After Rotation : "+Arrays.toString(nums));
}
}
*/
