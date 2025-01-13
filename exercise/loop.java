package exercise;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) { 
        Scanner scan = new Scanner (System.in); 
        System.out.print("Enter First Number : "); 
        int fnumber = scan.nextInt(); 
        System.out.print("Enter Last Number : "); 
        int lnumber = scan.nextInt(); 

        if (fnumber > lnumber) {

                System.out.println("=================");
        }
        else {
            for(int number = fnumber; number <= lnumber; number++ ){
                System.out.println("\nแม่" + number + "สูตรคูณ");
                for (int i = 1; i<= 12; i++){
                System.out.println(number + "X" + i + "=" + (number * i));
                }
            }
        }
    }
 }

