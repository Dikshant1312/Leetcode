//Leetcode 136-(singleNumber)
class Solution{
public int singleNumber(int [] nums){
int finder = 0;
for(int i = 0; i < nums.length; i++){
finder^=nums[i];
}
return finder;
}
}

class singleNumber{
public static void main(String [] args){
Solution s = new Solution();
int [] nums ={4,1,2,2,1};
int unique=s.singleNumber(nums);
System.out.println("Unique Element is : "+unique);
}
}
