import java.util.*;
public class SingleNumber {
    static int singleNumber(int[] arr){
        int n=arr.length;
        int xor=0;
       
        for(int num : arr){
            xor^=num;
        }
        return xor;
    }
    public static void main(String[] args){
int[] arr = {4, 1, 2, 1, 2};
int ans=singleNumber(arr);
System.out.println(ans);
    }
}