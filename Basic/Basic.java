import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name:");
        String name = sc.nextLine();

        System.out.println("Enter the Age:");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}