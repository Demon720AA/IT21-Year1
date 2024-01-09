package Lab02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class Lab02Tax {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Income : ");
       double money = input.nextDouble();
       if (money > 50000){
           System.out.println(money*0.1);
    }
       else {
           System.out.println(money*0.05);
       }
    }
}
