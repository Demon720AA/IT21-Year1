/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab08;

/**
 *
 * @author pc
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JLabel lb;
    private JTextField txt;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn10;
    private JButton btn11;
    private JButton btn12;
    private JButton btn13;
    private JButton btn14;
    private JButton btn15;
    private JButton btn16;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        p = new JPanel();
        txt = new JTextField();
        btn1 = new JButton("7");
        btn2 = new JButton("8");
        btn1 = new JButton("9");
        btn2 = new JButton("+");
        btn1 = new JButton("4");
        btn2 = new JButton("5");
        btn1 = new JButton("6");
        btn2 = new JButton("-");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn1 = new JButton("3");
        btn2 = new JButton("x");
        btn1 = new JButton("0");
        btn2 = new JButton("c");
        btn1 = new JButton("-");
        btn2 = new JButton("/");
        
        fr.setLayout(new GridLayout(2,1));
        fr.add(txt);
        p.add(btn1); p.add(btn2); p.add(btn3); p.add(btn4);
        fr.add(p);
//        p.add(btn5); p.add(btn6); p.add(btn7); p.add(btn8);
//        fr.add(p);
//        p.add(btn9); p.add(btn10); p.add(btn11); p.add(btn12);
//        fr.add(p);
//        p.add(btn13); p.add(btn14); p.add(btn15); p.add(btn16);
//        fr.add(p);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
