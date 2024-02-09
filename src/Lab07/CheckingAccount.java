/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab07;

/**
 *
 * @author pc
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount(){
        this(0.0, "", 0);
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    
    @Override
    public void withdraw(double a){
        if ((balance + credit) - a > 0){
            if (balance - a > 0){
                balance -= a;
            } else {
                credit = (credit + balance) - a;
                balance = 0;
            }
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else {
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a){
        double money = Double.parseDouble(a);
        withdraw(money);
    }
    
    @Override
    public String toString(){
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
}