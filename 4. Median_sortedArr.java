class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int[] new_arr = new int[nums1.length + nums2.length];
      int index = 0;
     
       for(int i:nums1){
        new_arr[index] = i;
        index++;
       }

       for(int i:nums2){
        new_arr[index] = i;
        index++;
       }
       Arrays.sort(new_arr);
       System.out.println(Arrays.toString(new_arr));
       double median=0;
       int num = new_arr.length;
       if (num % 2 == 0) {
        median = ( new_arr[index/2] +new_arr[index/2-1]) /2.0;
       }
       else{
         median = (new_arr[index/2]);
       }
      return median;   
    }
}
