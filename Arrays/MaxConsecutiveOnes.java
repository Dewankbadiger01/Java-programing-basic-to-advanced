import java.util.*;
public class MaxConsecutiveOnes {
    static int maxConsecutiveOnes(int [] arr){
        int maxcount=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxcount=Math.max(maxcount,count);
            }else{

                count=0;
            }
        }
        return maxcount;
    }
    public static void main(String[] args){
int[] arr = {1, 1, 0, 1, 1, 1};
int ans=maxConsecutiveOnes(arr);
System.out.println(ans);
    }
}