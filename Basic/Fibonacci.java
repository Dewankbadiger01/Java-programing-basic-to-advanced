import java.util.*;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int first=0,second=1;
                System.out.println("Fibonacci series : ");

        for(int i=0;i<n;i++){
                    System.out.print(first+ " ");

            int next=first+second;
            first=second;
            second=next;
        }
        System.out.println();
    }
}