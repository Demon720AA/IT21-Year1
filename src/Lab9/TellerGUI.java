/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab9;

/**
 *
 * @author pc
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TellerGUI {

    private JFrame fr;
    private JPanel p1, p2, p3;
    private JButton dep, wit, exit;
    private JTextField txt1, txt2;
    private double num = 0;
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        fr.setSize(300, 200);
        p1.add(new JLabel("Balance"));
        p1.add(txt1 = new JTextField(String.valueOf(num))); txt1.setEditable(false);
        p1.setLayout(new GridLayout(1, 2));

        p2.add(new JLabel("Amount"));
        p2.add(txt2 = new JTextField());
        p2.setLayout(new GridLayout(1, 2));

        p3.add(dep = new JButton("Deposit"));
        p3.add(wit = new JButton("Withdrawn"));
        p3.add(new JButton("Exit"));
        
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
        ActionListener pressed = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JButton button= (JButton) e.getSource();
                if (button.getText().equals("Deposit"))
                    deposit(Double.parseDouble((txt2.getText())));
                else if (button.getText().equals("Withdrawn"))
                    withdraw(Double.parseDouble(txt2.getText()));
                else if (button.getText().equals("Exit"))
                    System.exit(0);
                //exit
            }
        };
        
        dep.addActionListener(pressed);
        wit.addActionListener(pressed);
        exit.addActionListener(pressed);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public void deposit(double b){
        if(b >= 0)
            num += b;
        txt1.setText(String.valueOf(num));
        txt2.setText("");
    }
    public void withdraw(double b){
        if (num - b >= 0)
            num -= b;
        txt1.setText("");
        txt2.setText(String.valueOf(num));
    }
}

