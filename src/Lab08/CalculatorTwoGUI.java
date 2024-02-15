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
    private JPanel p1;
    private JPanel p2;;
    private JTextField txt;
    
    public CalculatorTwoGUI(){
        fr  = new JFrame("My Calculator");
        fr.setSize(400,400);
        p1 = new JPanel();
        p2 = new JPanel();
        txt = new JTextField();
        p1.add(txt);
        p1.setLayout(new GridLayout(1, 1));
        p2.add(new JButton("7"));
        p2.add(new JButton("8"));
        p2.add(new JButton("9"));
        p2.add(new JButton("+"));
        p2.add(new JButton("4"));
        p2.add(new JButton("5"));
        p2.add(new JButton("6"));
        p2.add(new JButton("-"));
        p2.add(new JButton("1"));
        p2.add(new JButton("2"));
        p2.add(new JButton("3"));
        p2.add(new JButton("x"));
        p2.add(new JButton("0"));
        p2.add(new JButton("c"));
        p2.add(new JButton("="));
        p2.add(new JButton("/"));
        p2.setLayout(new GridLayout(4, 4));
        
//        p.add(btn5); p.add(btn6); p.add(btn7); p.add(btn8);
//        fr.add(p);
//        p.add(btn9); p.add(btn10); p.add(btn11); p.add(btn12);
//        fr.add(p);
//        p.add(btn13); p.add(btn14); p.add(btn15); p.add(btn16);
//        fr.add(p);
        
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
