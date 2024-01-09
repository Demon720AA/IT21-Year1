package Lab01;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class Lab01SolutionFinder {
    public static void main(String[] args) {    //psvm
        double a=4, b=8, c=3, x1, x2;
        x1 = (-b + Math.sqrt(Math.pow(b, 2   )-4*a*c))/(2*a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2   )-4*a*c))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
