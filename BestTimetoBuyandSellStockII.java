//Leetcode-122(BestTimetoBuyandSellStockII)
class Solution{
public int maxProfit(int [] prices){
int maxProfit=0;
for(int i= 0; i<prices.length-1;i++){
if(prices[i+1]>prices[i]){
maxProfit+=prices[i+1]-prices[i];
}
}
return maxProfit;
}
}
/*This is main method just to check given array
class BestTimetoBuyandSellStockII{
public static void main(String [] args){
Solution s = new Solution();
int [] prices={7,1,5,3,6,4};
int maxProfit=s.maxProfit(prices);
System.out.println("Max Profit:"+maxProfit);
}
} 
*/
