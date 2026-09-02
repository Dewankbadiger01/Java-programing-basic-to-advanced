import java.util.*;
public class LargestDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();
        int largest=0;
        while(n>0){
            int digits=n%10;
            if(digits>largest){
                largest=digits;
            }
            n=n/10;
        }
        System.out.println("Largest : "+largest);
    }
}