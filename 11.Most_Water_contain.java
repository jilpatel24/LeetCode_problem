class Solution {
    public int maxArea(int[] height) {
      int maxArea = 0;
      int i = 0;//left Bound
      int j = height.length-1;//right bound
     while(i<j){
       int w = j-i;
       int h = Math.min(height[i],height[j]);
       int area = w*h;
       maxArea = Math.max(maxArea, area);
       if(height[i] < height[j]){ 
        i++; 
       }
       else{ 
        j--;
       }
       
     }
    return maxArea; 
    }
}
