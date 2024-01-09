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

public class Lab02Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = 0;
        System.out.print("Please insert your name : ");
        String name = sc.next();
        System.out.print("Please insert your age : ");
        int age = sc.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = sc.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = sc.nextInt();
        System.out.print("Please insert your body weight : ");
        int weight = sc.nextInt();
        if ((age >= 21) && (age <= 30)){
            salary = (numDay1*300)-(numDay2*50);
        }
        else if ((age >= 31) && (age <= 40)){
            salary = (numDay1*500)-(numDay2*50);
        }
        else if ((age >= 41)&&(age <= 50)){
            salary = (numDay1*1000)-(numDay2*50);
        }
        else if ((age >= 51) && (age <= 60)){
            salary = numDay1*3000;
        }
        System.out.println("Hi, "+name);
        System.out.println("Your salary is "+salary+" Baht");
        if ((weight >= 10) && (weight <=60)){
            salary = salary + 5000;
        }
        else if ((weight >= 61) && (weight <=90)){
            salary = salary + (5000-((weight-60)*10));
        }
        System.out.println("Your salary and bonus is "+salary+" Baht");
    }
}
