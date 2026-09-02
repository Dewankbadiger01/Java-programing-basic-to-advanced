import java.util.Scanner;

public class LargestTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int first = sc.nextInt();

        System.out.println("Enter the second number:");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println(first + " is greater");
        } else if (first < second) {
            System.out.println(second + " is greater than " + first);
        } else {
            System.out.println("Both are equal");
        }

        sc.close();
    }
}