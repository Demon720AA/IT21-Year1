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

public class Lab03Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many floor : ");
        int floor = sc.nextInt();
        for (int i = 0; i < floor; i++){
            System.out.println("#-#-#-#-#");
        }
    }
}
