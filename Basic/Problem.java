import java.util.Scanner;
public class Problem {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the marks of subject 1:");
       int m1=sc.nextInt();
       System.out.println("Enter the marks of subject 2:");
       int m2=sc.nextInt();
       System.out.println("Enter the marks of subject 3:");
       int m3=sc.nextInt();
    int total=m1+m2+m3;
    double Average=total/3;
double percentage=(total/300.0)*100;
    System.out.println("Total"+total);
    System.out.println("Average"+Average);

    System.out.println("percenatge"+percentage);

    }
}