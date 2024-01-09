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

public class Lab03Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, even_check = 0, odd_check = 0;
        System.out.println("Input number");
        while (true){
            num = sc.nextInt();
            if (num == -1){
                break;
            }
            if (num % 2 == 0){
                even_check+=1;
            }
            else{
                odd_check+=1;
            }
        }
        System.out.println("Odd number = " + odd_check + " and Even number = " + even_check);
    }
}
