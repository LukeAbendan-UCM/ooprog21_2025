import java.util.Scanner;

public class BankBalance3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double initialBalance = input.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (double rate : rates) {
            System.out.println();
            System.out.printf("With an initial balance of $%.1f at an interest rate of %.2f%n", initialBalance, rate);

            double balance = initialBalance;

            for (int year = 1; year <= 4; year++) {
                balance = balance + (balance * rate);
                System.out.printf("After year %d balance is %.4f%n", year, balance);
            }
        }
        input.close();
    }
}
