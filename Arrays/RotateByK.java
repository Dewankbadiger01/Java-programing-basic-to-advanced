import java.util.*;
public class RotateByK {
static void rotateRight(int[] arr, int k){
    if(arr==null || arr.length<=1){
        return;
    }
k=k%arr.length;
    for(int step=0;step<k;step++){
                    int last = arr[arr.length - 1];
    for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];

    }
    
                    arr[0]=last;
    }

}
    public static void main(String[] args){
int[] arr = {1, 2, 3, 4, 5};
int k = 2;
 rotateRight(arr,k);
System.out.println(Arrays.toString(arr));
    }
}