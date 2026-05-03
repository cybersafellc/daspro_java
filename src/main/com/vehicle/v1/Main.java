package main.com.vehicle.v1;

import main.com.vehicle.v1.blueprints.Mobil;
import main.com.vehicle.v1.blueprints.Motor;
import main.com.vehicle.v1.interfaces.Kendaraan;

public class Main {
    public static void main(String[] args){
        Kendaraan original = new main.com.vehicle.v1.blueprints.Kendaraan();
        Kendaraan motor1 = new Motor();
        Kendaraan mobil1 = new Mobil();
        original.sound();
        motor1.sound();
        mobil1.sound();

        motor1.setNama("kawasaki z900");
        motor1.setColor("orange");
        mobil1.setNama("BMW X1");
        mobil1.setColor("black");
        mobil1.setPoliceNumber("B1RI");
        motor1.setPoliceNumber("B1MY");

        System.out.println(motor1.getColor());
        System.out.println(mobil1.getColor());

        System.out.println(motor1.getPoliceNumber());
        System.out.println(mobil1.getPoliceNumber());

        System.out.println(mobil1.getNama());
        System.out.println(motor1.getNama());
    }
}