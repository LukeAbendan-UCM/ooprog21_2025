import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 100.00;
        double INTEREST_RATE = 0.03;
        int year = 1;

        do {
            balance += balance * INTEREST_RATE;
            System.out.printf("After year %d at %.2f interest rate, balance is $%.2f\n", year, INTEREST_RATE, balance);
            year++;

            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes \n" +
                    "   or any other number for no >> ");
            int userChoice = scanner.nextInt();

            if (userChoice != 1) {
                break;
            }
        } while (true);
        scanner.close();
    }
}
