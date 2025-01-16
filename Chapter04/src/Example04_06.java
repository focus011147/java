import java.util.Scanner;

public class Example04_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Enter your sentense : ");
        str = scanner.nextLine();
        if (!str.isBlank() && !str.isEmpty()) {
            int pos, countWord = 0;
            while (str.length() > 0) {
                pos = str.indexOf(" ");
                if (pos >= 0) {
                    System.out.println(str.substring(0, pos));
                    str = str.substring(pos + 1);
                    countWord++;
                } else {
                    System.out.println(str);
                    str = "";
                    countWord++;
                }
            }
            System.out.println("Sentense is " + countWord + " word.");
        } else
            System.out.println("No data input.");
        scanner.close();
    }
}
