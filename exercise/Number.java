package exercise;

import java.util.Scanner; 
public class Number { 
 
 public static void main(String[] args) { 
 Scanner scan = new Scanner (System.in); 
 System.out.print("Enter Number : "); 
 long number = scan.nextLong(); 
    int odd = 0;
    int even = 0;
    int zero = 0;

    while (number > 0) {
        int digit = (int) (number % 10);
        if (digit == 0) {
                zero++; 
        } else if (digit %2 ==0) {
            even++;
        }else {
            odd++;
        }
        number /=10;
    }
    System.out.println("Odd digit = " +odd);
    System.out.println("even digit = " +even);
    System.out.println("zero digit = " +zero);

 } 
}