/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_2;

/**
 *
 * @author Pattr
 */
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public double getBalance(){
        return (balance);
    }
    public String getName(){
        return (name);
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void deposit(double a){
        if (a > 0){
            this.balance = this.balance + a;
            System.out.println(a + " baht is deposited to " + this.name);
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void showAccount(){
        System.out.println(this.name + " account has " + this.balance + " baht.");
    }
    public void withdraw(double a)  throws WithdrawException{
        if (a < 0)
            System.out.println("Input number must be a positive interger.");
        else if ((balance - a) < 0)
            throw new WithdrawException("Account " + this.name + " has not enough money.");
        else{
            balance = balance - a;
            System.out.println(a + " baht is withdraw from " + name);
        }
    }
}


