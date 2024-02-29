/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab10;

/**
 *
 * @author pc
 */
public class main {
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        Account acct3 = new Account(3000, "Somsri03");
        Account acct4 = new Account(3000, "Somsri04");
        Account acct5 = new Account(3000, "Somsri05");
        Account acct6 = new Account(3000, "Somsri06");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.addAccount(acct3);
        cust.addAccount(acct4);
        cust.addAccount(acct5);
        cust.addAccount(acct6);
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        cust.getAccount(2).deposit(3000);
        cust.getAccount(3).deposit(3000);
        cust.getAccount(4).deposit(3000);
        System.out.println(cust);
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
        cust.getAccount(i).showAccount();
 }
        System.out.println(cust.toString());
}
}
