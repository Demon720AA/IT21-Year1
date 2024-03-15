
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;

public class MyClock extends JLabel implements Runnable{
    public void run() {
        while(true){
            try{
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                this.setFont(new Font("Arial",Font.BOLD, 70));
                this.setText(String.format("%02d:%02d:%02d",hour,min,sec));
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    
}
