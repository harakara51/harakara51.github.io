package solutions;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    private String[] numbers = { "0", "1", "2", "3", "4", "5", "6",
            "7", "8", "9" };
    private String[] operators = { "+", "-", "/", "*" };
    private JButton[] operatorButtons;
    private JButton[] numberButtons;
    private JButton clearButton;
    private JButton equalsButton;
    private JTextField textField;
    private StringBuilder op1 = new StringBuilder("");
    private StringBuilder op2 = new StringBuilder("");
    private long result;
    private char operator;

    public Calculator() {
        super("Calculator");
        addComponents();
        addEventHandlers();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void addComponents() {
        textField = new JTextField();
        equalsButton = new JButton("=");
        clearButton = new JButton("C");
        JButton blankButton = new JButton();

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 4));

        operatorButtons = new JButton[operators.length];
        for (int i = 0; i < operatorButtons.length; i++) {
            operatorButtons[i] = new JButton(operators[i]);
            panel.add(operatorButtons[i]);
        }

        numberButtons = new JButton[numbers.length];
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(numbers[i]);
            panel.add(numberButtons[i]);
        }

        panel.add(clearButton);
        panel.add(blankButton);

        this.add(textField, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        this.add(equalsButton, BorderLayout.SOUTH);
    }

    private void addEventHandlers() {
        for (JButton button : numberButtons) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String buttonLabel = e.getActionCommand();
                    op1.append(buttonLabel);
                    setTextFieldText(op1.toString());
                }
            });
        }

        for (JButton button : operatorButtons) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String buttonLabel = e.getActionCommand();
                    operator = buttonLabel.charAt(0);

                    op2.append(op1.toString());
                    clearOp1();
                }
            });
        }

        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    long o1 = Long.parseLong(op1.toString());
                    long o2 = Long.parseLong(op2.toString());

                    switch (operator) {
                    case '+':
                        result = o2 + o1;
                        break;
                    case '-':
                        result = o2 - o1;
                        break;
                    case '*':
                        result = o2 * o1;
                        break;
                    case '/':
                        result = o2 / o1;
                        break;
                    }
                    setTextFieldText("" + result);
                }
                catch (NumberFormatException ex) {
                    setTextFieldText("Please enter valid data");
                }
                clearOp1();
                clearOp2();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearOp1();
                clearOp2();
                setTextFieldText("");
            }
        });
    }

    private void clearOp1() {
        op1.delete(0, op1.length());
    }

    private void clearOp2() {
        op2.delete(0, op2.length());
    }

    private void setTextFieldText(String text) {
        textField.setText(text);
    }

    public static void main(String[] arg) {
        new Calculator();
    }
}