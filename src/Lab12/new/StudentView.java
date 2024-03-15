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
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentView implements ActionListener, WindowListener{
    private JFrame frame;
    private JPanel panel;
    private JTextField fieldID;
    private JTextField fieldName;
    private JButton deposit;
    private JButton withdraw;
    private JLabel labelID;
    private JLabel labelName;
    private JLabel labelMoney;
    private JLabel label;
    
    public StudentView(){
        frame = new JFrame();
        panel =  new JPanel();
        fieldID = new JTextField();
        fieldName = new JTextField();
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        labelID = new JLabel("ID:");
        labelName = new JLabel("Name:");
        labelMoney = new JLabel("Money:");
        label = new JLabel("0");
        
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        frame.addWindowListener(this);
        
        panel.setLayout(new GridLayout(4, 2));
        panel.add(labelID);
        panel.add(fieldID);
        panel.add(labelName);
        panel.add(fieldName);
        panel.add(labelMoney);
        panel.add(label);
        panel.add(deposit);
        panel.add(withdraw);
        
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent ev){
        if (ev.getSource().equals(deposit)){
            label.setText((Integer.parseInt(label.getText())+100)+"");
        } else if (ev.getSource().equals(withdraw)){
            if((Integer.parseInt(label.getText())-100) <= 0){
                label.setText("0");
            } else {
                label.setText((Integer.parseInt(label.getText())-100)+"");
            }
        }
    }
    public void windowOpened(WindowEvent ev){
        try(FileInputStream fir = new FileInputStream("StudentM.dat")){
            ObjectInputStream fim = new ObjectInputStream(fir);
            Student s = (Student) fim.readObject();
            this.fieldName.setText(s.getName());
            this.fieldID.setText(""+s.getID());
            this.label.setText(""+s.getMoney());
            fir.close();
            fim.close();
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
    public void windowClosing(WindowEvent ev){
        try(FileOutputStream fir = new FileOutputStream("StudentM.dat")){
            ObjectOutputStream fim = new ObjectOutputStream(fir);
            fim.writeObject(new Student(this.fieldName.getText(), Integer.parseInt(this.fieldID.getText()), Integer.parseInt(this.label.getText())));
            fir.close();
            fim.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}
