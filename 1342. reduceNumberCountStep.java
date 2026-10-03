class Solution {
    static int helper(int n,int count){
      //count is initially 0
      //base condition
       if(n == 0){
        return count;
       }else if(n % 2 == 0){
        return helper(n/2, count+1);
       }else{
       return helper(n-1, count+1);
       }
    }
    static int numberOfSteps(int n) {
       int totalStep = 0;
       return helper(n, totalStep); 
    }
    
   
}
