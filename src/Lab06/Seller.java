/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab06;

/**
 *
 * @author pc
 */
public class Seller extends Employee{
    public Food sell(Employee e){
        if (e.getWallet().getBalance() >= Food.getPrice()){
            double money = e.getWallet().getBalance()-Food.getPrice();
            getWallet().setBalance(getWallet().getBalance()+Food.getPrice());
            e.getWallet().setBalance(money);
            Food snack = new Food();
            return snack;
        }
        else{
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}
