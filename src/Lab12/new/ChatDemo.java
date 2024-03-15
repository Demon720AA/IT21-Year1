/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab12;

/**
 *
 * @author pc
 */
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel jp;
    private JScrollPane sp;
    private JTextArea ta;
    private JTextField tf;
    private JButton bt1, bt2;
    private DateTimeFormatter dtf;
    public ChatDemo(){
        fr = new JFrame();
        jp = new JPanel();
        ta = new JTextArea(20, 45);
        tf = new JTextField(45);
        bt1 = new JButton("Submit");
        bt2 = new JButton("Reset");
        
        fr.setLayout(new BorderLayout());
        ta.setEditable(false);
        jp.setLayout(new FlowLayout());
        sp = new JScrollPane(ta);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        fr.add(sp, BorderLayout.NORTH);
        fr.add(tf,BorderLayout.CENTER);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        jp.add(bt1);
        jp.add(bt2);
        fr.add(jp, BorderLayout.SOUTH);
        fr.setSize(400, 420);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.addWindowListener(this);
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(bt1)){
            dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText()+dtf.format(LocalDateTime.now())+": "+tf.getText()+"\n");
        }else if(ae.getSource().equals(bt2)){
            ta.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try(FileInputStream fin = new FileInputStream("ChatDemo.dat");
            ObjectInputStream in = new ObjectInputStream(fin);){
            ta.setText((String) in.readObject());
        }catch(IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try(FileOutputStream fout = new FileOutputStream("ChatDemo.dat");
            ObjectOutputStream out = new ObjectOutputStream(fout);) {
            out.writeObject(ta.getText());
        }catch (IOException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
