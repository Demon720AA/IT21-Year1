/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab04;

/**
 *
 * @author pc
 */
public class Student {
    public String name;
    public double mScore, fScore;
    public void showGrade(){
        double s = (mScore*0.4)+(fScore*0.4)+20;
        System.out.print("Your grade : ");
        if (100 >= s && s >= 80){
            System.out.println("A");
        }
        else if (s >= 70){
            System.out.println("B");
        }
        else if (s >= 60){
            System.out.println("C");
        }
        else if (s >= 50){
            System.out.println("D");
        }
        else if (s >= 0){
            System.out.println("F");
        }
    }
}
class Main {
    
}
