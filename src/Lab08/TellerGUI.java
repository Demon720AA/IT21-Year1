/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab08;

/**
 *
 * @author pc
 */
import javax.swing.*;
import java.awt.*;

public class TellerGUI {

    private JFrame fr;
    private JPanel p1, p2, p3;

    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        fr.setSize(300, 200);
        p1.add(new JLabel("Balance"));
        p1.add(new JTextField());
        p1.setLayout(new GridLayout(1, 2));

        p2.add(new JLabel("Amount"));
        p2.add(new JTextField());
        p2.setLayout(new GridLayout(1, 2));

        p3.add(new JButton("Deposit"));
        p3.add(new JButton("Withdrawn"));
        p3.add(new JButton("Exit"));
        
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
