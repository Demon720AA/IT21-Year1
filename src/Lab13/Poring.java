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
import javax.swing.ImageIcon;

public class Poring  implements MouseListener, Runnable{
    private JFrame frame;
    private JLabel label;
    private ImageIcon icon;
    private static int numPoring;
    
    public Poring(){
        Poring.numPoring++;
        
        icon = new ImageIcon("poring.png");
        frame = new JFrame();
        label = new JLabel(numPoring+"", icon, JLabel.CENTER);
        
        frame.setResizable(false);
        frame.addMouseListener(this);

        frame.add(label);
        
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int)(Math.random()*(size.getWidth()-frame.getWidth())), (int)(Math.random()*(size.getHeight()-frame.getHeight())));
        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(frame)) {
            frame.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void run() {
       while (true){
            try{
                frame.setLocation(frame.getX()+(int)(Math.random()*10-3), frame.getY()+(int)(Math.random()*10-3));
                Thread.sleep(500);
            }
            catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}