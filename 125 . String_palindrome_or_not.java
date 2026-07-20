class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-z0-9]","");//if string containg extra element which is not between a-z & 0-9 then we replace with blank space
    
          int start = 0 ;
          int end = s.length()-1;
          while(start < end){
           if(s.charAt(start) != s.charAt(end)){
            return false;
           }
           start++;
           end--;
         } 
        return true;
    }
}
