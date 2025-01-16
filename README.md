import javax.swing.JOptionPane;

public class TaxCalculator {

    public static void main(String[] args) {
        while (true) {
            // รับข้อมูลเงินเดือนต่อเดือนจากผู้ใช้
            String input = JOptionPane.showInputDialog(null, "Enter monthly salary (0 to quit):", 
                                                        "Input", JOptionPane.QUESTION_MESSAGE);

            if (input == null || input.isEmpty()) {
                break; // กรณีผู้ใช้กด Cancel หรือไม่ใส่ข้อมูล
            }

            double monthlySalary = Double.parseDouble(input);

            if (monthlySalary == 0) {
                JOptionPane.showMessageDialog(null, "Exit Program", "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            // คำนวณเงินรายได้ต่อปี
            double annualIncome = monthlySalary * 12;

            // คำนวณภาษีที่ต้องจ่าย
            double taxToBePaid = calculateTax(annualIncome);

            // แสดงผลลัพธ์
            String result = String.format("Annual Income: %,.2f\nTax to be paid: %,.2f", annualIncome, taxToBePaid);
            JOptionPane.showMessageDialog(null, result, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // ฟังก์ชันสำหรับคำนวณภาษี
    public static double calculateTax(double annualIncome) {
        double tax = 0;

        if (annualIncome > 1_000_000) {
            tax += (annualIncome - 1_000_000) * 0.25;
            annualIncome = 1_000_000;
        }
        if (annualIncome > 750_000) {
            tax += (annualIncome - 750_000) * 0.20;
            annualIncome = 750_000;
        }
        if (annualIncome > 500_000) {
            tax += (annualIncome - 500_000) * 0.15;
            annualIncome = 500_000;
        }
        if (annualIncome > 300_000) {
            tax += (annualIncome - 300_000) * 0.10;
            annualIncome = 300_000;
        }
        if (annualIncome > 150_000) {
            tax += (annualIncome - 150_000) * 0.05;
        }

        // รายได้ <= 150,000 จะไม่มีภาษี (0%)
        return tax;
    }
}
