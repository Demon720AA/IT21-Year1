/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;

public class review02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double score, x = input.nextDouble(), y = input.nextDouble(), z = input.nextDouble();
        score = (x+y+z)/3;
        System.out.println(score);
    }
}
