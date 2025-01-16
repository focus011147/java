
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise03_8 {
    
    public static void main(String[] args) {
        final  int  NUM_GAMES = 12;
        int won;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter munber of games won (0 to " + NUM_GAMES +") :");
        won = scan.nextInt();
        while (won < 0 || won > NUM_GAMES) {
            System.out.print("Invalid inpput.please reenter :");
            won = scan.nextInt();
        }
        float ration = (float) won/ NUM_GAMES;
        NumberFormat fmt = NumberFormat.getPercentInstance();
        System.out.println();
        System.out.println("Winning percentage : " + fmt.format(ration)) ;
       scan.close();
    }

}
