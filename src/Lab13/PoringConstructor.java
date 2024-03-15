/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab13;

/**
 *
 * @author pc
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PoringConstructor implements ActionListener{
    private JFrame frame;
    private JButton addbutton;
    private JPanel panel;
    
    public PoringConstructor(){
        frame = new JFrame();
        addbutton = new JButton("Add");
        panel = new JPanel();
        
        addbutton.addActionListener(this);
        
        panel.add(addbutton);
        frame.add(panel);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addbutton)){
            Poring poring = new Poring();
            Thread thread = new Thread(poring);
            thread.start();
        }
    }
}