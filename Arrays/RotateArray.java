import java.util.*;
public class RotateArray {
    static void rotateRight(int arr[]){
        if(arr == null || arr.length<=1){
return;
        }
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
    public static void main(String[] args){
int[] arr = {10, 20, 30, 40, 50};
rotateRight(arr);
System.out.println(" rolate array is : " +Arrays.toString(arr));
    }
}
