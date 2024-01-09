/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05;

/**
 *
 * @author pc
 */
public class Vehicle {
    private int fuel;
    private String topSpeed;
    
    protected void setFuel(int i){
        fuel = i;
    }
    protected void setTopSpeed(String n){
        topSpeed = n;
    }
    protected int getFuel(){
        return fuel;
    }
    protected String getTopSpeed(){
        return topSpeed;
    }
    public void showInfo(){
        System.out.println("Fuel is "+fuel+" litre and Top Speed is "+topSpeed+" m/s.");
    }
}
