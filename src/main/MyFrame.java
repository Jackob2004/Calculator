package main;

import listener.ButtonListener;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JLabel label;

    private JButton[] buttons;

    private ButtonListener listener;

    private Calculator calculator;
    public MyFrame(){
        setTitle("Simple Calculator");
        setSize(500,620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        listener = new ButtonListener(this);
        calculator = new Calculator(this);

        initialiseLabel();
        initialiseButtons();

        setVisible(true);
    }

    private void initialiseLabel() {
            label = new JLabel();
            label.setBounds(0, 0,500,100);
            label.setOpaque(true);
            label.setBackground(Color.BLACK);
            label.setForeground(Color.GREEN);
            label.setFont(new Font("Arial", Font.PLAIN,30));
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setText("0");

            add(label);
    }


    private void initialiseButtons() {
        JButton button;
        buttons = new JButton[16];
        char[][] symbols = new char[][]{ {'7','8', '9', '<'}, {'4','5', '6','/'}, {'1','2','3','x'}, {'0','=','-','+'}};
        int index=  0;

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                button = new JButton();
                button.setBounds(i*121 + 10,j*120+110,100,100);
                button.setFont(new Font("Arial", Font.PLAIN,30));
                button.setText(String.valueOf(symbols[j][i]));
                button.setActionCommand(String.valueOf(index));
                button.addActionListener(listener);

                add(button);
                button.setVisible(true);
                buttons[index] = button;
                index++;
            }
        }
    }

    public JLabel getLabel() { return label; }

    public Calculator getCalculator() { return calculator; }
}
