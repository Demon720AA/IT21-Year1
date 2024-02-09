/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab07;

/**
 *
 * @author pc
 */
//public class TestAccount {
//    public static void main(String[] args) {
//        Account a1 = new Account();
//        a1.showAccount();
//    }
//}
public class TestAccount {
     public static void main(String[] args) {
        Account a1 = new Account(50000,"61070033");
        a1.showAccount();
        a1.deposit(500);
        a1.showAccount();
        a1.withdraw(40000);
        a1.showAccount();
    }
}
