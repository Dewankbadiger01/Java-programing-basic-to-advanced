import java.util.*;
public class PatternInverted {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER RUCHITA?: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i-i;i<=n-1;i++){
                System.out.print("*");
            }
                            System.out.println();

        }
        sc.close();
    }
}