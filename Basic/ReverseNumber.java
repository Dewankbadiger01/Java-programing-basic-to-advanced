import java.util.*;
public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
        int digits=n%10;
        rev=(rev*10)+digits;
        n=n/10;
        }
        System.out.println("REVERSED :"+rev);
        sc.close();
    }
}