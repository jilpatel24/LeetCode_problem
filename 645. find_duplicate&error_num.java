
import java.util.Arrays;

public class p1{
  public static void main(String[] args) {
      int[] arr = {1,2,2,4};
      int[] ans = findDuplicates(arr);
      System.out.println(Arrays.toString(ans));

    
  }
  public static int[] findDuplicates(int[] arr) {
        cyclic_sort(arr);
        for(int i = 0;i < arr.length;i++){
         if(arr[i] != i+1){
          return new int[] {arr[i],i+1};
         }
         }
    return new int[]{-1,-1} ;  
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


 

      
