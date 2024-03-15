
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopMyFrame implements MouseListener{
    private JFrame frame;
    private StopMyClock clock;
    private Thread t;
    public static void main(String[] args) {
        new StopMyFrame();
    }   
    public StopMyFrame(){
        frame = new JFrame();
        clock = new StopMyClock();
        frame.addMouseListener(this);
        
        t = new Thread(clock);
        t.start();

        frame.setLayout(new FlowLayout());
        frame.add(clock);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 240);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if(clock.paused == false){
           clock.pause();
       } else{
           clock.resume();
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
}
