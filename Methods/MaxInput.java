import java.util.*;
public class MaxInput {
    static int max(int a,int b){
        return (a>b)?a:b;
    }
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number Ruchita: ");
 int a=sc.nextInt();
System.out.println("Enter the NUmber Dewank : ");
int b=sc.nextInt();
int result=max(a,b);
System.out.println(" MAximum : "+result);
    }
}