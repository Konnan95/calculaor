import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private double total1 = 0.0;

    private double total2=0.0;

    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnFinish;
    private JButton btnYmnog;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDelete;
    private JButton btnOne;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnZero;


    private void getOperator (String btnText) {
        math_operator = btnText.charAt(0);
        total1=total1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }


    public JavaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText=btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText=btnTwo.getText();
                textDisplay.setText(btnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText=btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText=btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText=btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText=btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText=btnSeven.getText();
                textDisplay.setText(btnSevenText);

            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText=btnEight.getText();
                textDisplay.setText(btnEightText);

            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText=btnNine.getText();
                textDisplay.setText(btnNineText);

            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText=btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text=btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnFinish.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                case '+':
                total2=total1 + Double.parseDouble(textDisplay.getText());
                break;
                case '-':
                total2=total1 - Double.parseDouble(textDisplay.getText());
                break;
                case '/':
                total2=total1 / Double.parseDouble(textDisplay.getText());
                break;
                case '*':
                total2=total1 * Double.parseDouble(textDisplay.getText());
                break;
            }
                textDisplay.setText(Double.toString(total2));
                total1=0;

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                total2=0;
                textDisplay.setText("");
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text=btnMinus.getText();
                getOperator(button_text);

            }
        });
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text=btnDelete.getText();
                getOperator(button_text);
            }

        });
        btnYmnog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text=btnYmnog.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
