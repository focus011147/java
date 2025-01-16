import javax.swing.JOptionPane;

public class Example05_03 {
    public static void start() {
        boolean done = true;
        String choice = "";
        String menu = ">>> Main Menu  <<<\n 1. Cal Grade\n";
        menu += " 2. Change Number\n 3. Exit\nSelect choice : ";
        do {
            choice = JOptionPane.showInputDialog(menu);
            switch(choice) {
                case "1" : calGrade();  break;
                case "2" : changeNumber();  break;
                case "3" : done = false;  break;
                default: 
                    JOptionPane.showMessageDialog(null, "No choice",
                    "Error Message" ,JOptionPane.ERROR_MESSAGE);
            }
        } while(done);
        JOptionPane.showMessageDialog(null, "Exit Program.");
    }

    public static void calGrade() {
        String scoreStr, grade;
        int score ;
        scoreStr = JOptionPane.showInputDialog("Enter your score :");
        score = Integer.parseInt(scoreStr);
        if (score >= 80 ) grade = "A";
        else if (score >= 75 ) grade = "B+";
        else if (score >= 70 ) grade = "B";
        else if (score >= 65 ) grade = "C+";
        else if (score >= 60 ) grade = "c";
        else if (score >= 55 ) grade = "D+";
        else if (score >= 50 ) grade = "D";
        else grade = "F";
        String output;
        output = "Score : " + score + ", got grade : "+ grade;
        JOptionPane.showMessageDialog(null, output);
    }

    public static void changeNumber() {
        int num;
        String numStr, binStr = "", output="";
        numStr = JOptionPane.showInputDialog("Enter integer number :");
        num = Integer.parseInt(numStr);
        while (num > 0) {
            int digit = num % 2;
            binStr = digit + binStr;
            num = num / 2; 
        }
        output = "Integer Number : " + numStr + "\nBinnary number : " + binStr;
        JOptionPane.showMessageDialog(null, output);

    }
    public static void main(String[] args) {
        Example05_03.start();
    }
}