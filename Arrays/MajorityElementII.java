import java.util.*;
public class MajorityElementII {
static List<Integer> majorityElement(int[] arr){
List<Integer>result = new ArrayList<>();
        if(arr==null || arr.length==0){
            return result;
        }
        int dewank=0;
        int ruchita=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<arr.length;i++){
if (arr[i]==dewank){
    count1++;
}else if (arr[i]==ruchita){
    count2++;
}else if(count1==0){
 dewank=arr[i];
    count1=1;
}else if(count2==0){
 ruchita=arr[i];
    count2=1;
}else{
    count1--;
    count2--;
}
        }
        count1=0;count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==dewank){
                count1++;
            }else if(arr[i]==ruchita){
                count2++;
            }
        }
            int n=arr.length;
        if(count1>n/3) {
            result.add(dewank);}
        if (count2 > n / 3 && dewank != ruchita) {
            result.add(ruchita); 
        }
        return result;
}
    public static void main(String[] args){
int[] arr = {1, 1, 1, 2, 2, 2, 3};
        List<Integer> ans = majorityElement(arr);
            System.out.println(ans);
    }
}