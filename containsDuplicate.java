//Leetcode-217(containsDuplicate)
import java.util.HashSet;

class Solution{
public boolean containsDuplicate(int [] nums){
HashSet<Integer> numbers = new HashSet<>();
for(int i = 0; i< nums.length; i++){
if(numbers.contains(nums[i])){
return true;
}
numbers.add(nums[i]);
}
return false;
}
}

class containsDuplicate{
public static void main(String [] args){
Solution s= new Solution();
int [] nums ={1,2,3,4};
boolean a=s.containsDuplicate(nums);
System.out.println("Answer:"+a);
}
}
