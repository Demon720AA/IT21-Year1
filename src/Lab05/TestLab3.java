/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab05;

/**
 *
 * @author pc
 */
public class TestLab3 {
//    public static void main(String[] args) {
//        Plane p1 = new Plane();
//        p1.setPlaneInfo(500, "High");
//        p1.showPlaneInfo();
//        Car c1 = new Car();
//        c1.setCarInfo(500, "High", "Diesel");
//        c1.showCarInfo();
//    }

//    public static void main(String[] args) {
//        Plane p1 = new Plane();
//        p1.setPlaneInfo(300, "High");
//        p1.showPlaneInfo();
//        p1.fly();
//        p1.showPlaneInfo();
//        p1.fly();
//        p1.showPlaneInfo();
//    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCarInfo(60, "High", "Diesel");
        c1.showCarInfo();
        c1.move();
        c1.showCarInfo();
        c1.move();
        c1.showCarInfo();
    }
}
