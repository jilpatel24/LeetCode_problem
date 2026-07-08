class Solution {
    public int firstMissingPositive(int[] nums) {
       int i = 0;
    while(i < nums.length){
       int index = nums[i]-1; //for find missing element in arr number's index is number itself
         if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[index]){
           swap(nums, i, index);
        }else{
           i++;
         }
        }
      //for finding missing number
       for (int index = 0; index < nums.length ; index++) {
          if(nums[index] != index + 1){
             return index+1;
      }
    }
    return nums.length+1;
}
 static void swap(int arr[],int first,int second){
   int temp = arr[first];
   arr[first] = arr[second];
   arr[second] = temp ;
 }
}
