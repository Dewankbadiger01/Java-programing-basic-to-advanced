import java.util.*;
public class RearrangeArrayBySign {
    static int[] rearrangeArraybySign(int arr[]){
        int n=arr.length;
        int[] result= new int[n];
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                result[pos]=arr[i];
                pos+=2;
            }else{
                result[neg]=arr[i];
                neg+=2;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] ans=rearrangeArraybySign(arr);
        System.out.println(Arrays.toString(ans));
    }
}