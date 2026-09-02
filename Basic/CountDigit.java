import java.util.*;
public class CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : " );
        int n=sc.nextInt();
        System.out.println("Enter the digit : " );
        int Target=sc.nextInt();
        int count=0;
        while(n>0){
            int digit=n%10;
            if(digit==Target){
                count++;
            }
            n=n/10;
        }
        System.out.print(count+"times");
    }
}