package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * @param amount the amount of money borrowed
     * @return remaining amount to pay off after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Rewrite this method
        int remaining = amount;

        for (int i = 0; i < 3; i++){
            remaining -= remaining * 0.1;
        }

        return remaining;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
