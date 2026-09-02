import java.util.*;

public class NumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        // Check positive, negative, or zero
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println(n + " is Zero");
        }

        // Check even or odd
        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        sc.close();
    }
}