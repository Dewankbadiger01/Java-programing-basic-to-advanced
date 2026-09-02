import java.util.*;
public class SmallestDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int Smallest=9;
        while(n>0){
            int digits=n%10;
            if(digits<Smallest){
                Smallest=digits;
            }
            n=n/10;
        }
        System.out.println("Smallest : "+Smallest);
    }
}