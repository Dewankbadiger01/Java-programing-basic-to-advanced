import java.util.*;
public class RemoveDuplicates {
static int removeDuplicates(int[] arr){
int j=0;
for(int i=1;i<arr.length;i++){
    if(arr[i]!=arr[j]){
        j++;
        arr[j]=arr[i];
    }
}
return j+1;
}
public static void main(String[] args){
int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
  int uniqueCount = removeDuplicates(arr);
  System.out.println("unique count : "+uniqueCount);
  System.out.println("removed duplicate : "+Arrays.toString(Arrays.copyOf(arr,uniqueCount)));
}
}