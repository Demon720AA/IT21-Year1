/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author pc
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalculatorSample {

    private JFrame fr;
    private JPanel p1, p2;
    private JTextField txt;
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plus, minus, multipal, divide, equal, delete;
    private String collect;
    private double firstNum = 0, secNum = 0;

    public CalculatorSample() {
        fr = new JFrame("My Calculator");
        fr.setSize(400, 400);
        p1 = new JPanel();
        p2 = new JPanel();
        txt = new JTextField();
        p1.add(txt);
        p1.setLayout(new GridLayout(1, 1));
        p2.add(b7 = new JButton("7"));
        p2.add(b8 = new JButton("8"));
        p2.add(b9 = new JButton("9"));
        p2.add(plus = new JButton("+"));
        p2.add(b4 = new JButton("4"));
        p2.add(b5 = new JButton("5"));
        p2.add(b6 = new JButton("6"));
        p2.add(minus = new JButton("-"));
        p2.add(b1 = new JButton("1"));
        p2.add(b2 = new JButton("2"));
        p2.add(b3 = new JButton("3"));
        p2.add(multipal = new JButton("x"));
        p2.add(b0 = new JButton("0"));
        p2.add(delete = new JButton("c"));
        p2.add(equal = new JButton("="));
        p2.add(divide = new JButton("/"));
        p2.setLayout(new GridLayout(4, 4));

        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);

        ActionListener numberButtonListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                if (button.getText().equals("c")) {
                    firstNum = 0;
                    secNum = 0;
                    txt.setText("");
                    return;
                }
                if (!txt.getText().isEmpty()) {
                    txt.setText(String.valueOf(Double.parseDouble(txt.getText()) * 10 + Double.parseDouble(button.getText())));
                } else {
                    txt.setText(button.getText());
                }
            }
        };

        ActionListener Symbols = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                if (firstNum == 0 && !button.getText().equals("=")) {
                    firstNum = Double.parseDouble(txt.getText());
                    collect = button.getText();
                    txt.setText("");
                } else if (!button.getText().equals("=")) {
                    secNum = Double.parseDouble(txt.getText());
                    calculate();
                    collect = button.getText();
                    firstNum = Double.parseDouble(txt.getText());
                    txt.setText("");
                } else {
                    secNum = Double.parseDouble(txt.getText());
                    calculate();
                }
            }
        };

        b9.addActionListener(numberButtonListener);
        b8.addActionListener(numberButtonListener);
        b7.addActionListener(numberButtonListener);
        b6.addActionListener(numberButtonListener);
        b5.addActionListener(numberButtonListener);
        b4.addActionListener(numberButtonListener);
        b3.addActionListener(numberButtonListener);
        b2.addActionListener(numberButtonListener);
        b1.addActionListener(numberButtonListener);
        b0.addActionListener(numberButtonListener);
        delete.addActionListener(numberButtonListener);
        plus.addActionListener(Symbols);
        minus.addActionListener(Symbols);
        multipal.addActionListener(Symbols);
        divide.addActionListener(Symbols);
        equal.addActionListener(Symbols);

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public void calculate() {
        if (collect.equals("+")) {
            if (secNum != 0) {
                txt.setText(String.valueOf(firstNum + secNum));
            } else {
                txt.setText(String.valueOf(firstNum + firstNum));
            }
        } else if (collect.equals("-")) {
            if (secNum != 0) {
                txt.setText(String.valueOf(firstNum - secNum));
            } else {
                txt.setText(String.valueOf(firstNum - firstNum));
            }
        } else if (collect.equals("x")) {
            if (secNum != 0) {
                txt.setText(String.valueOf(firstNum * secNum));
            } else {
                txt.setText(String.valueOf(firstNum * firstNum));
            }
        } else if (collect.equals("/")) {
            if (secNum != 0) {
                txt.setText(String.valueOf(firstNum / secNum));
            } else {
                txt.setText(String.valueOf(firstNum / firstNum));
            }
        }
        if (!txt.getText().equals("")) {
            firstNum = Double.parseDouble(txt.getText());
        }
        secNum = 0;
    }
}
