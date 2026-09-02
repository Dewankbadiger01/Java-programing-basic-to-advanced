import java.util.*;
public class NumberPyramid2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();
        String row="";
        for(int i=1;i<=n;i++){
            row=row+i+" ";
            System.out.println(row);
        }
       
    }
}