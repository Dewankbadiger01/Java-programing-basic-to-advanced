import java.util.*;
public class MaxThree {
    static int max(int a,int b,int c){
        return (a>b && a>c)?a :(b>c?b:c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER : ");
        int a=sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int b=sc.nextInt();
        System.out.println("ENTER THE THIRD NUMBER : ");
        int c=sc.nextInt();
        int result=max(a,b,c);
        System.out.println("Maximum is : "+result);
    }
}