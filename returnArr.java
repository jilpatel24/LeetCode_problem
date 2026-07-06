
import java.util.ArrayList;
import java.util.List;


public class p1{
  public static void main(String[] args) {
      int[] arr = {0};

      findDisappearedNumbers(arr);
      System.out.println("Missing Num :"+ans);
  }
 public static List<Integer> findDisappearedNumbers(int[] arr) {
        
  cyclic_sort(arr);
  //for finding missing number
    
}
 public static void cyclic_sort(int[] arr){
    
    int i = 0;
    while(i < arr.length ){
       int index = arr[i]; //for find missing element in arr number's index is number itself
       
       if(arr[i] < arr.length && arr[i] != arr[index]){
        swap(arr, i, index);
       }else{
        i++;
       }
       }
      List<Integer> ans = new ArrayList<>();
      for(int j = 0; j < arr.length; j++) {
        if(arr[j] != j+1){
        ans.add(j+1);
      }
    }
 }
 static void swap(int arr[],int first,int second){
   int temp = arr[first];
   arr[first] = arr[second];
   arr[second] = temp ;
 }
}



 

      
