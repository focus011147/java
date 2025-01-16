import java.util.Scanner;

public class exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        float decimal = sc.nextFloat();

        int temp = (int) (decimal*1000);
        int num1 = temp % 10;
        temp /= 10;
        int num2 = temp % 10;
        temp /= 10;
        int num3 = temp % 10;

         System.out.println("Decimal number #1 : " + num3); 
        System.out.println("Decimal number #2 : " + num2); 
        System.out.println("Decimal number #3 : " + num1);
    }
}
