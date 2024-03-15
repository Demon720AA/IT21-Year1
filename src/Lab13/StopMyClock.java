
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;

public class StopMyClock extends JLabel implements Runnable{
    private static int time = 0;
    public Boolean paused = false;
    
    public void pause(){
        paused = true;
        this.setForeground(Color.GRAY);
    }
    public synchronized void resume(){
        this.setForeground(Color.BLACK);
        paused = false;
        this.notify();
    }
    private synchronized void checkPaused(){
        while (paused){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    public void run() {
        while(true){
            try{
                checkPaused();
                int sec = time%60;
                int min = (time/60)%60;
                int hour = time/3600;
                this.setFont(new Font("Arial",Font.BOLD, 70));
                this.setText(String.format("%02d:%02d:%02d",hour,min,sec));
                Thread.sleep(1000);
                time++;
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
