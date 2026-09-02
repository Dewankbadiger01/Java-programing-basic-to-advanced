import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
                System.out.println("***********Calculator******");

        System.out.println("Enter the  first Number :  ");
        int a=sc.nextInt();
        System.out.println("Enter the operator :  ");
     char operator =sc.next().charAt(0);
     System.out.println("Enter the second Number: ");
     int b=sc.nextInt();
     int Result=0;

     switch(operator){
        case '+':
Result=a+b;
            break;
        case '-':
Result=a-b;
            break;
        case '*':
Result=a*b;
            break;
        case '/':
Result=a/b;
            break;
     
      default:
        System.out.println("Invalid operator");
     }
   
     System.out.println("RESULT :  " + Result);
    
        }
}