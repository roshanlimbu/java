import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI extends JFrame implements ActionListener {

  private JTextField numField1, numField2, resultField;
  private JButton addButton, subButton, mulButton, divButton;

  public CalculatorGUI() {
    setTitle("Simple Calculator :");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 400);
    setLocationRelativeTo(null);

    numField1 = new JTextField(15);
    numField2 = new JTextField(15);
    resultField = new JTextField(15);
    // here making result readonly 
    resultField.setEditable(false);

    addButton = new JButton("Add");
    subButton = new JButton("Sub");
    mulButton = new JButton("Mult");
    divButton = new JButton("Div");

    addButton.addActionListener(this);
    subButton.addActionListener(this);
    mulButton.addActionListener(this);
    divButton.addActionListener(this);

    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(5, 2, 5, 5));
    panel.add(new JLabel("Number 1:"));
    panel.add(numField1);
    panel.add(new JLabel("Number 2:"));
    panel.add(numField2);
    panel.add(new JLabel("Result:"));
    panel.add(resultField);
    panel.add(addButton);
    panel.add(subButton);
    panel.add(mulButton);
    panel.add(divButton);

    add(panel);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      double num1 = Double.parseDouble(numField1.getText());
      double num2 = Double.parseDouble(numField2.getText());
      double result = 0;

      if (e.getSource() == addButton) {
        result = num1 + num2;
      } else if (e.getSource() == subButton) {
        result = num1 - num2;
      } else if (e.getSource() == mulButton) {
        result = num1 * num2;
      } else if (e.getSource() == divButton) {
        if (num2 != 0) {
          result = num1 / num2;
        } else {
          resultField.setText("Division by zero is not possible.");
          return;
        }
      }

      resultField.setText(String.format("%.2f", result)); // Display result with 2 decimal places
    } catch (NumberFormatException ex) {
      resultField.setText("Invalid input");
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new CalculatorGUI();
      }
    });
  }
}

