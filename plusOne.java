//Leetcode-66(PlusOne)
import java.util.Arrays;
class Solution{
public int [] plusOne(int [] digits){
int currentDigit = digits.length - 1;
while(digits[currentDigit]==9){
if(currentDigit==0){
int [] newArray = new int[digits.length + 1];
newArray[0] = 1 ;
return newArray;
}
digits[currentDigit] = 0;
currentDigit--;
}
digits[currentDigit]++;
return digits;
}
}
/*
This is main method just to check the given array
public class plusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9, 9};
        Solution solution = new Solution();
        int[] result = solution.plusOne(digits);
        String resultString = Arrays.toString(result);
        System.out.println("Result: " + resultString);
    }
}
*/
