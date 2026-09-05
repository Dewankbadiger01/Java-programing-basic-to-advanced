import java.util.*;
public class ProductExceptSelfopti {
    static int[] productExpectselfopti(int arr[]){
        int n=arr.length;
        int[] prefix=new int[n];
        int[] sufix=new int[n];
        int[] result= new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
prefix[i]=prefix[i-1]*arr[i-1];
        }
        sufix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            sufix[i]=sufix[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            result[i]=prefix[i]*sufix[i];
        }
        return result;

    }
    public static void  main(String[] args){
        int[] arr = {1, 2, 3, 4};
int[] ans=productExpectselfopti(arr);
System.out.println(Arrays.toString(ans));
    }
}