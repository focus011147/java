package exercise;

import java.util.Scanner;

public class Lab1 { 
    public static void main( String args[] ) 
    { 
        Scanner scan = new Scanner(System.in); 
        System.out.print("Enter celsius : "); 
        double celsius = scan.nextDouble(); 
        double fahrenheit = (9.0/5.0)*celsius+32;
        System.out.print(celsius + " celsius = " +fahrenheit +" fahrenheit \n\n"); 

        System.out.print("========================================\n\n"); 
        System.out.print("Enter Principal : "); 
        double principal = scan.nextDouble(); 
        System.out.print("Enter Interate : "); 
        double interate = scan.nextDouble();
        double depositable = principal*Math.pow((1+(interate/100)),5)-principal;
        System.out.print("depositable money : " +depositable +"\n\n"); 

        System.out.print("========================================\n\n"); 
        System.out.print("Enter Number : "); 
        int number = scan.nextInt(); 
       
            int num1 = number/1000;
            int num2 = number/100 %10;
            int num3 = number/10%10;
            int num4 = number%10;
            System.out.printf("%d %d %d %d \n",num1 , num2 , num3 , num4); 
            scan.close();
    } 
   } 