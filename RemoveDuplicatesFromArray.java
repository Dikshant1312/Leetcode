/*To solve "Removing Duplicates from Array" problem we need to consider the given array with duplicates i.e: Input: nums = [0,0,1,1,1,2,2,3,3,4]
now in this we use 2 pointers to remove the duplicates Consider like this [0,0,1,1,1,2,2,3,3,4]
                                                                           u i   
in this we will compare 'u' with 'i' now if both are same elements than we increment 'i' position like this [0,0,1,1,1,2,2,3,3,4]
                                                                                                             u   i
Now in above case 'u' is different element and 'i' is different element so we update 'u+1' with the element of current 'i' which will be [0,1,1,1,1,2,2,3,3,4]
                                                                                                                                          u   i    
and then increment both pointers as follows [0,1,1,1,1,2,2,3,3,4]
                                               u   i
Again comparing and checking the elements we get following array [0,1,2,3,4,2,2,3,3,4]
And then to return number of unique elements we return u+1 because thats where the array will be having all unique elements. */

class RemoveDuplicatesFromArray{
  public int removeDuplicates(int [0,0,1,1,1,2,2,3,3,4] nums){
    int lastUniqueIndex=0;
    for(int i = 1; i< nums.length; i++){
      if(nums[lastUniqueIndex]!=nums[i]){
        nums[lastUniqueIndex+1]=nums[i];
        lastUniqueIndex++;        
      }
    }
    return lastUniqueIndex+1;
  }
}
