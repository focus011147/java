import java.util.Scanner;

public class exc4 {
      public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num : ");
        num = scan.nextInt();

        sum = (num / 100) + ((num / 10) % 10) + (num % 10);
        System.out.println("Summation of digit = "+sum);
    }
}


