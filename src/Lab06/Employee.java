/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab06;

/**
 *
 * @author pc
 */
public class Employee {

    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public static String getNationality() {
        return nationality;
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public int getEnergy() {
        return energy;
    }

    public void eat(Food f) {
        this.energy += Food.getEnergy();
    }

    public boolean buyFood(Seller s) {
        if (s !=null){
            this.eat(s.sell(this));
            return true;
        }
        else{
            return false;
        }
    }

    public boolean equals(Employee e) {
        return this.name.equals(e.name);
    }

    public String toString() {
        return "My name is " + getName() + ".\nI have " + getEnergy() + " energy left.\nI have a balance of "+getWallet().getBalance()+" baht.";
    }
}
