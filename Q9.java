package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate (R): ");
        double R = sc.nextDouble();

        System.out.print("Enter Years (N): ");
        int N = sc.nextInt();

        double amount = P * Math.pow(1 + (R / 100), N);

        System.out.println("Final Amount: " + amount);
    }
}
