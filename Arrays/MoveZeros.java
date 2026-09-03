import java.util.*;
public class MoveZeros {
    static void MoveZero(int arr[]){
        if(arr==null || arr.length<=1){
            return;
        }
        int insertPos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertPos]=arr[i];
                insertPos++;
            }
        }
        while(insertPos<arr.length){
            arr[insertPos]=0;
            insertPos++;
        }
    }
    public static void main(String[] args){
int[] arr = {0, 1, 0, 3, 12};
MoveZero(arr);
System.out.println("Move to zero end"+Arrays.toString(arr));
    }
}