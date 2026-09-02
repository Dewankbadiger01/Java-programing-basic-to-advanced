import java.util.*;
public class CountDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();
        int count=0;
        if(n==0){
            count=1;
        }else{
        while(n>0){
count++;
n=n/10;
        }
        }
        System.out.println("total Count : "+count);
        sc.close();
    }
}