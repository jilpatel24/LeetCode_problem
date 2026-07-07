class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        cyclic_sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
         if(nums[i] != i+1){
          ans.add(nums[i]);
         }
         }
    return ans;  
  }
 public static void cyclic_sort(int[] arr){
    
    int i = 0;
    while(i < arr.length ){
       int index = arr[i] - 1; //for find missing element in arr number's index is number itself
    
       if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[index]){
        swap(arr, i, index);
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
