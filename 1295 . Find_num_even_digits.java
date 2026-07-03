class Solution {
    public int findNumbers(int[] nums) {
         int count = 0;
       for (int i=0;i<nums.length ;i++) {
          int num = Math.abs(nums[i]);
          int digit = 0;
          do{
            digit++;
            num /= 10;
          }while(num > 0);
          if(digit % 2 == 0){
            count++;
          }
       }
  return count;
    }
}
