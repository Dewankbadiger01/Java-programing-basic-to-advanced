import java.util.*;
public class MissingNumber {
    static int missingNumber(int[] arr){
        int n=arr.length;
        int expectedsum=n*(n+1)/2;
        int actualsum=0;
        for(int i=0;i<arr.length;i++){
            actualsum+=arr[i];

        }
        return expectedsum-actualsum;
    }
    public static void main(String[] args){

    }
}