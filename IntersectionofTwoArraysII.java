//Leetcode-350(IntersectionofTwoArraysII)
import java.util.Hashtable;
import java.util.ArrayList;
class Solution{
public int [] intersect(int [] nums1, int [] nums2){
Hashtable<Integer, Integer> nums1Map = new Hashtable<>();
ArrayList<Integer> Intersection = new ArrayList<>();
//This is for nums1
for(int i = 0; i< nums1.length; i++){
if(nums1Map.containsKey(nums1[i])){
nums1Map.put(nums1[i],nums1Map.get(nums1[i])+1);
}
else{
nums1Map.put(nums1[i], 1);
}
}
//This is for nums2
for(int j = 0; j< nums2.length; j++){
if(nums1Map.containsKey(nums2[j])){
Intersection.add(nums2[j]);
nums1Map.put(nums2[j],nums1Map.get(nums2[j])-1);
if(nums1Map.get(nums2[j])==0){
nums1Map.remove(nums2[j]);
}
}
}
int [] result = new int[Intersection.size()];
for(int k = 0; k < result.length; k++){
result[k] = Intersection.get(k);
}
return result;
}
}
/*
This is main method just to check arrays that are given
class IntersectionofTwoArraysII{
public static void main(String [] args){
Solution s = new Solution();
int [] nums1 = {4,9,5};
int [] nums2 = {9,4,9,8,4};
int [] fr=s.intersect(nums1,nums2);
System.out.println("Output"+fr);
}
}
*/
