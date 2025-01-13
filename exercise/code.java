package exercise;
import javax.swing.JOptionPane;
public class code {
    public static void main (String[] args){    
    String order = "";
    String bill = "Your order :\n";
    String detail = ":";
    String money = "";
    String remain = "";
    int total = 0 ;
        do{
            order = JOptionPane.showInputDialog(null,"Select You beverage Order : ","test",1);
            String [] words = order.split(" ");
            for (String word : words){
                System.out.println(word);
            }
            if (words[0].equals("Exit" )) break;
            if (words[0].equals("Pepsi" ))
            {
                int price = 15;
                int qty = Integer.parseInt(words[1]);
                int unit = price *qty;
                total += unit;
                bill +="PEPSI 15 X" + qty + "=" + (price*qty)+"\n";
                if (detail.equals(":")) detail += unit ;
                else{
                    detail += "+" + unit;
                }
            }
            if (words[0].equals("Fantared" ))
            {
                int price = 13;
                int qty = Integer.parseInt(words[1]);
                int unit = price *qty;
                total += unit;
                bill +="Fanta red 13 X" + qty + "=" + (price*qty)+"\n";
                if (detail.equals(":")) detail += unit ;
                else{
                    detail += "+" + unit;
                }
            }
            if (words[0].equals("Coffee" ))
            {
                int price = 15;
                int qty = Integer.parseInt(words[1]);
                int unit = price *qty;
                total += unit;
                bill +="Coffee 25 X" + qty + "=" + (price*qty)+"\n";
                if (detail.equals(":")) detail += unit ;
                else{
                    detail += "+" + unit;
                }
            }
            if (words[0].equals("Sprite" ))
            {
                int price = 15;
                int qty = Integer.parseInt(words[1]);
                int unit = price *qty;
                total += unit;
                bill +="Sprite 20 X" + qty + "=" + (price*qty)+"\n";
                if (detail.equals(":")) detail += unit ;
                else{
                    detail += "+" + unit;
                }
            }
            if (words[0].equals("Mineral" ))  
            {
                int price = 15;
                int qty = Integer.parseInt(words[1]);
                int unit = price *qty;
                total += unit;
                bill +="Mineral 18X" + qty + "=" + (price*qty)+"\n";
                if (detail.equals(":")) detail += unit ;
                else{
                    detail += "+" + unit;
                }
            }
        }while(true);
        bill += "Total" + detail + "=" + total;
        JOptionPane.showInputDialog(null,bill,"confirm order");
        money = JOptionPane.showInputDialog(null, "Enter Money : ","test",1);
        remain += "Remain" + money + "-" + total + "=" ;
        JOptionPane.showInputDialog(remain);

    }
}
