package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Loan Period (years): ");
        int loanPeriod = sc.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / 12;
        int numberOfPayments = loanPeriod * 12;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment: " + monthlyPayment);
        System.out.println("Total Payment: " + totalPayment);
    }
}
