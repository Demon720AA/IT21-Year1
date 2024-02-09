/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab07;

/**
 *
 * @author pc
 */
public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if (a > 0){
            this.balance = this.balance + a;
            System.out.println(a + " baht is deposited to " + name + ".");
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if (this.balance - a > 0){
            this.balance = this.balance - a;
            System.out.println(a + " baht is withdrawn from " + name + ".");
        }else{
            if (a < 0){
                System.out.println("Input number must be a positive integer.");
            }
            if (this.balance - a < 0){
                System.out.println("Not enough money!");
            }
        }
    }
    public void showAccount(){
        System.out.println(name + " account has " + balance + " baht.");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
}
