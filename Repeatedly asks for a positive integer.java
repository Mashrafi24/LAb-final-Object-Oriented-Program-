import java.util.Scanner;

public class DivisorsProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice = 'Y';

        System.out.println("This program is designed to exhibit the positive divisors of");
        System.out.println("positive integers supplied by you. The program will repeatedly");
        System.out.println("prompt you to enter a positive integer. Each time you enter a");
        System.out.println("positive integer, the program will print all the divisors of your");
        System.out.println("integer in a column and in decreasing order.\n");

        while (choice == 'Y' || choice == 'y') {

            int n;

            while (true) {
                System.out.print("Please enter a positive integer: ");
                n = sc.nextInt();

                if (n > 0) {
                    break;
                } else {
                    System.out.println(n + " is not a positive integer.");
                }
            }

            // Print divisors in decreasing order
            for (int i = n; i >= 1; i--) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }

            // Ask user to continue
            while (true) {
                System.out.print("\nWould you like to see the divisors of another integer (Y/N)? ");
                choice = sc.next().charAt(0);

                if (choice == 'Y' || choice == 'y' || choice == 'N' || choice == 'n') {
                    break;
                } else {
                    System.out.println("Please respond with Y (or y) for yes and N (or n) for no.");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
