import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0){
            int digits=n%10;
            rev=(rev*10)+digits;
            n=n/10;
        }
        if(original==rev){
            System.out.println(original+ " is palindrome");
        }else{
           System.out.println(original+ " is not palindrome");

        }
        sc.close();
    }
}