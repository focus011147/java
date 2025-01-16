

import java.util.Scanner;

public class exc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program calculate deposit.");
        double principile,rate;
        System.out.print("Enter principile : ");
        principile = sc.nextDouble();
        System.out.print("Enter interest rate : ");
        rate = sc.nextDouble();

        double deposit,interest,principileCal;
        principileCal = principile;
        interest = principileCal * (rate/100);
        deposit = principileCal + interest;

        principileCal = deposit;
        interest = principileCal * (rate/100);
        deposit = principileCal + interest;

        principileCal = deposit;
        interest = principileCal * (rate/100);
        deposit = principileCal + interest;

        principileCal = deposit;
        interest = principileCal * (rate/100);
        deposit = principileCal + interest;

        System.out.println("Deposit 4 year : "+deposit);
        System.out.println("Principle : "+principile);
        System.out.println("Interest rate : "+rate+"%");
        System.out.println("Interest : "+ (deposit-principile));
        sc.close();
    }
}


