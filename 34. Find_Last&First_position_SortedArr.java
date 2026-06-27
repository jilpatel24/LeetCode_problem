class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int[] ans={-1,-1};
        
        int start_index=start_end_Index(nums, target,true);
        int end_index=start_end_Index(nums, target,false);
    
      ans[0]=start_index;
      ans[1]=end_index;
       return ans;
    }

    public int start_end_Index(int[] nums,int target,boolean findIndex){
      int start=0;
      int end=nums.length-1;
      int mid;
      int ans=-1;

      while(start <= end){
         mid = start + (end-start)/2;

         if(target > nums[mid]){
          start = mid+1;
         }
         else if(target < nums[mid]){
            end = mid-1;
         }
         else {
            ans = mid;
           if(findIndex){
            end=mid-1;
           }else{
            start=mid+1;
           }
         }
      }
     return ans; 
}
}
