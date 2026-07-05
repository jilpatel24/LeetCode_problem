class Solution {
    public int missingNumber(int[] nums) {
        cyclic_sort(nums);
  //for finding missing number
  for (int i = 0; i < nums.length; i++) {
      if(nums[i] != i){
        return i;
      }
  }
 return nums.length;
}
 public static void cyclic_sort(int[] nums){
    
    int i = 0;
    while(i < nums.length ){
       int index = nums[i]; //for find missing element in arr number's index is number itself
       
       if(nums[i] < nums.length && nums[i] != nums[index]){
        swap(nums, i, index);
       }else{
        i++;
       }
 }
 }
 static void swap(int arr[],int first,int second){
   int temp = arr[first];
   arr[first] = arr[second];
   arr[second] = temp ;
 }
}
