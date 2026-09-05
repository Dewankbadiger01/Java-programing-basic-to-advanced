import java.util.*;
public class ProductExceptSelf {
    static int[] productExpectself(int arr[]){
        int n=arr.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            int curr=1;
            for(int j=0;j<n;j++){
                if(i!=j){
                    curr*=arr[j];
                }
            }
            result[i]=curr;
        }
        return result;
    }
    public static void main(String[] args){
int[] arr = {1, 2, 3, 4};
int[] ans=productExpectself(arr);
System.out.println(Arrays.toString(ans));
    }
}