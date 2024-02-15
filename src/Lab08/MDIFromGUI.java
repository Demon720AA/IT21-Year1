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

public class MDIFromGUI {

    private JDesktopPane dp;
    private JInternalFrame app1, app2, app3;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu mu1, mu2, mu3, mu4;
    private JMenuItem mi1, mi2, mi3, mi4, mi5;

    public MDIFromGUI() {
        dp = new JDesktopPane();
        app1 = new JInternalFrame("Application 1", true, true, true, true);
        app2 = new JInternalFrame("Application 2", true, true, true, true);
        app3 = new JInternalFrame("Application 3", true, true, true, true);

        app1.setSize(190, 100);
        app1.setVisible(true);

        app2.setSize(190, 150);
        app2.setVisible(true);

        app3.setSize(220, 170);
        app3.setVisible(true);

        int x = app1.getX() + app1.getWidth() + 10;
        int y = app1.getY();
        app2.setLocation(x, y);
        int x2 = app2.getX() + app2.getY() + 10;
        int y2 = app2.getY();
        app3.setLocation(x2, y2);
        
        dp.add(app1);   dp.add(app2);   dp.add(app3);
        fr = new JFrame("SubMenuItem Demo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        mu1 = new JMenu("File");
        mu2 = new JMenu("Edit");
        mu3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(mu1);    mb.add(mu2);    mb.add(mu3);
        
        mu4 = new JMenu("New");
        mu1.add(mu4);  mu1.add(new JMenuItem("Open")); mu1.addSeparator(); mu1.add(new JMenuItem("Save")); mu1.add(new JMenuItem("Exit"));
        mu4.add(new JMenuItem("Windows"));  mu4.addSeparator(); mu4.add(new JMenuItem("Message"));
        
        fr.add(dp, BorderLayout.CENTER);
        fr.setSize(900, 600);
        fr.setVisible(true);
    }
}
