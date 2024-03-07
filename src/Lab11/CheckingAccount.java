/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab11_2;

/**
 *
 * @author Pattr
 */
public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public double getCredit(){
        return (credit);
    }
    public void setCredit(double credit){
        if (credit < 0)
            System.out.println("Input number must be a positive integer.");
        else
            this.credit = credit;
    }
    public String toString(){
        return ("The " + super.getName() + " account has " + super.getBalance() + " baht and " + this.credit + " credits.");
    }
    @Override
    public void withdraw(double a) throws WithdrawException{
        if (a < 0)
            System.out.println("Input number must be a positive interger.");
        else if (super.getBalance() - a >= 0){
            super.setBalance(super.getBalance() - a);
            System.out.println(a + " baht is withdraw from " + super.getName() + " and your credit balance is " + this.getCredit());
        }
        else if (super.getBalance() - a + this.credit >= 0){
            this.setCredit(this.credit + super.getBalance() - a);
            super.setBalance(0);
            System.out.println(a + " baht is withdraw from " + super.getName() + " and your credit balance is " + this.getCredit());
        }
        else
            throw new WithdrawException("Account " + this.name + " has not enough money.");
    }
    public void withdraw(String a) throws WithdrawException{
        withdraw(Double.parseDouble(a));
    }
}
