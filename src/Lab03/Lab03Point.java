package Lab03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class Lab03Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int num = sc.nextInt();
        for (int i=0; i<num; i++){
            if ((i+1)%5 != 0){
                System.out.print("|");
            }
            else{
                System.out.println("|");
            }
        }
        System.out.println();
    }
}
