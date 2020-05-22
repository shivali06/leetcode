/* Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself. */
class Solution {
    public int[] plusOne(int[] digits) {
     int len = digits.length;
        if(digits[len-1]==9){
            int[] newdg = new int[len+1];
            for (int i = 0; i < len; i++) 
            newdg[i] = digits[i]; 
            newdg[len]=0;
            newdg[len-1]=1;
            return newdg;
        }
        else{
            digits[len-1]=digits[len-1]+1;
            return digits;
        }
       
    }
}
