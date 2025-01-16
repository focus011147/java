import javax.swing.JOptionPane;
public class Example05_04 {
    
    public void start() {
        int num1,num2;
        String output = "";    
        num1 = Integer.parseInt( JOptionPane.showInputDialog( "Enter value 1 :" ) ); 
		num2 = Integer.parseInt( JOptionPane.showInputDialog( "Enter value 2 :" ) );
        output = "before call method num1 = " + num1 + ", num2 = " + num2;
        JOptionPane.showMessageDialog(null,output, "Result",JOptionPane.PLAIN_MESSAGE );
        changeValue(num1, num2);
        output = "After call method num1 = " + num1 + ", num2 = " + num2;
        JOptionPane.showMessageDialog( null,output, "Result",JOptionPane.PLAIN_MESSAGE );
        System.exit(0);
    }
    
    public void changeValue(int n1 , int n2) {
        n1 = n1 + n2;
        n2 = n2 - 5;
   }
	public static void main(String[] args) {
     	  new Example05_04().start();
        
    }
}
