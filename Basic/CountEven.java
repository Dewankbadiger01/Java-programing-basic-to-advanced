import java.util.*;
public class CountEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println(" Count of Even : " +count);
    }
}