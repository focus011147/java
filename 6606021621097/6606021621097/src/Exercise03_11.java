import java.util.Scanner;

public class Exercise03_11 {
     public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integers:");
        number = scanner.nextInt();
        do {
            sum = sum + number;
            number = number - 1;
        }while (number > 0);
        System.out.println("Sumnalue is " + sum);
        scanner.close();
    }
}
