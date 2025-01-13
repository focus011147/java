package exercise;
import javax.swing.JOptionPane;
public class demo {
    public static void main (String[] args){
        String order = "";
        String bill = "Your order :\n";
        String detail = ":";
        int total = 0 ;
        do{
            order = JOptionPane.showInputDialog(null,"test","test",1);
            String [] words = order.split(" ");
            for (String word : words){
                System.out.println(word);
            }
            if (words[0].equals("Exit")) break;
            if (words[0].equals("Pepsi")) {
                int price = 15;
                int qty = Integer.parseInt(words[1]);
                int unit = price *qty;
                total += unit;
                bill +="PEPSI 15 X" +qty+"="+(price*qty)+"\n";
                if (detail.equals(":")) detail += unit ;
                else{
                    detail += "+" + unit;
                }
                
            }
        } while(true);
        bill += "Total" + detail + "=" + total;
        JOptionPane.showInputDialog(null,bill,"order",1);
    }
}
