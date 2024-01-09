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

public class Lab02Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = input.nextDouble();
        System.out.print("Input your account type(please type A B C or X in uppercase) : ");
        String actype = input.next();
        if (actype .equals("A")){
            System.out.println("Your total money in one year = "+(money+(money*0.015)));
        }
        else if (actype.equals("B")){
            System.out.println("Your total money in one year = "+(money+(money*0.02)));
        }
        else if (actype.equals("C")){
            System.out.println("Your total money in one year = "+(money+(money*0.015)));
        }
        else if (actype.equals("D")){
            System.out.println("Your total money in one year = "+(money+(money*0.05)));
        }
    }
}
