/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab06;

/**
 *
 * @author pc
 */
public class Programmer extends Employee {

    private int happiness;

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void coding(String str) {
        if (this.getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            setEnergy(getEnergy() - 30);
            setHappiness(happiness - 30);
        } else {
            System.out.println("Error Error Error");
            setEnergy(getEnergy() - 30);
            setHappiness(happiness - 30);
        }
    }

    public void coding(char str) {
        if (this.getEnergy() >= 30) {
            System.out.println("Your code is " + str);
            setEnergy(getEnergy() - 30);
            setHappiness(happiness - 30);
        } else {
            System.out.println("Error Error Error");
            setEnergy(getEnergy() - 30);
            setHappiness(happiness - 30);
        }
    }
}
