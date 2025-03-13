import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AppProduct extends JFrame implements ActionListener {
    JPanel panelForm;
    JTextField textCode, textName, textPrice;
    JLabel label1, label2, label3;
    JButton saveBtn, readBtn;
    JTextArea outputArea;
    JScrollPane scrollPane;
    Container c;
    Font myFont = new Font("Tahoma", Font.BOLD, 16);
    String FILENAME = "products.txt";

    public AppProduct() {
        super(" Example Read and Write Product ");
        c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        guiForm();
        saveBtn = new JButton(" Save Product ");
        saveBtn.setFont(myFont);
        saveBtn.addActionListener(this);
        c.add(saveBtn);
        readBtn = new JButton(" Read Product ");
        readBtn.setFont(myFont); 
        readBtn.addActionListener(this);
        c.add(readBtn);
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);
        outputArea.setFont(myFont);
        scrollPane = new JScrollPane(outputArea);
        c.add(scrollPane);
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void guiForm() {
        panelForm = new JPanel();
        panelForm.setLayout(new GridLayout(3, 2));
        panelForm.setPreferredSize(new Dimension(400, 100));
        label1 = new JLabel("Enter Product Code : ");
        label1.setFont(myFont);
        panelForm.add(label1);
        textCode = new JTextField(10);
        textCode.addActionListener(this);
        textCode.setFont(myFont);
        panelForm.add(textCode);
        label2 = new JLabel("Enter Product Name : ");
        label2.setFont(myFont);
        panelForm.add(label2);
        textName = new JTextField(10);
        textName.setFont(myFont);
        panelForm.add(textName);
        label3 = new JLabel("Enter Product Price : ");
        label3.setFont(myFont);
        panelForm.add(label3);
        textPrice = new JTextField(10);
        textPrice.setFont(myFont);
        panelForm.add(textPrice);
        c.add(panelForm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveBtn) {
            saveProduct();
        } else if (e.getSource() == readBtn) {
            readProduct();
        }

    }

    public void saveProduct() {
        String codeStr, nameStr, priceStr;
        codeStr = textCode.getText().toString();
        nameStr = textName.getText().toString();
        priceStr = textPrice.getText().toString();
        if (!codeStr.isEmpty() && !nameStr.isEmpty() && !priceStr.isEmpty()) {
            String dataStr = codeStr + "," + nameStr + "," + priceStr;
            try {
                FileWriter out = new FileWriter(FILENAME, true);
                BufferedWriter writer = new BufferedWriter(out);
                writer.write(dataStr + "\n");
                writer.close();
                out.close();
                JOptionPane.showMessageDialog(this, " Save already");
                textCode.setText("");
                textName.setText("");
                textPrice.setText("");
            } catch (IOException exception) {
                JOptionPane.showMessageDialog(this, "can not write data",
                        "Error Message ", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Data not complete",
                    "Error Message ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void readProduct() {
        outputArea.setText("");
        try {
            FileReader in = new FileReader(FILENAME);
            BufferedReader reader = new BufferedReader(in);
            String s1;
            while ((s1 = reader.readLine()) != null) {
                outputArea.append(s1 + "\n");
            }
            reader.close(); // close stream input
            in.close();
        } catch (IOException exception) {
            JOptionPane.showMessageDialog(this, "can not read file",
                    "Error Message ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AppProduct();
    }
}
