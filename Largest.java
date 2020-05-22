/* In a given integer array nums, there is always exactly one largest element.

Find whether the largest element in the array is at least twice as much as every other number in the array.

If it is, return the index of the largest element, otherwise return -1. */

class Solution {
    public int dominantIndex(int[] nums) {
        int large = 0;
        int index = 0;
        boolean flag = false;
        for (int k=0 ; k<nums.length ; k++){
            if(nums[k] > large){
                large=nums[k];
                index=k;
            }
        }
        for(int i=0;i<nums.length;i++){
           if( (nums[i] != large)&&(nums[i]*2>large)){
               return -1;
           }
        }
        return index;
    }
}
