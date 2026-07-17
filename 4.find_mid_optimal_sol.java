class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
       int total = nums1.length + nums2.length;
       int half = (total+1)/2;
   //performing binary search
   int start = 0;
   int end = nums1.length;
   while(start <= end){
      int mid1 = start + (end-start)/2;
      int mid2 = half - mid1;
      int left1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
      int right1 =  (mid1 == nums1.length) ? Integer.MAX_VALUE : nums1[mid1];
      int left2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
       int right2 = (mid2 == nums2.length) ? Integer.MAX_VALUE : nums2[mid2];
   //comparing with condition
   if(left1 <= right2 && left2 <= right1){
     if(total % 2 == 0){
       return (Math.max(left1,left2) + Math.min(right1,right2))/2.0;
     }else{
       return Math.max(left1,left2);
    }
  }else if(left1 >= right2){//check in left side
     end = mid1-1;
   }else{
    start = mid1+1;
   }
   }
   return -1.0; 
    }
}
