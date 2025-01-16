import java.util.Scanner;

public class Exercise03_3 {
    
     public static void main(String[] args) {
        int num1,num2,num3,min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        if (num1 < num2)
            if (num1 < num3)
            min = num1;
        else
            min = num3;
    else if (num2 < num3)
        min = num2;
    else
        min = num3;
    System.out.println("Minimum value : "+ min);
    sc.close();
    }
}


