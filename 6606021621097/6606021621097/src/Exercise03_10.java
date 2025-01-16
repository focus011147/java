import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise03_10 {
     public static void main(String[] args) {
        final double RATE =  0.045;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twoDigit = new DecimalFormat("###,##0.00");
        double amount, interest, principal;

        System.out.println(": Program Calculate Deposit :");
        // get principal from user
        System.out.print("Enter principal : ");
        principal = scanner.nextDouble();
        // calculate amout on deposit
        amount = principal;
        for (int year = 1; year <= 5; year++) {
            // calculate new amount for specified year
            interest = amount * RATE;
            amount = amount + interest;
        }
        System.out.print("Principal = ");
        System.out.println(twoDigit.format(principal));
        System.out.println("Interest rate = " + twoDigit.format(RATE * 100) + "%");
        System.out.println("Year = 5");
        System.out.print("Amount of deposit = ");
        System.out.println(twoDigit.format(amount));
    }
}

