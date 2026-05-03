package main.com.computer.v1;

import main.com.computer.v1.device.Laptop;
import main.com.computer.v1.interfaces.Computer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Scanner inputan = new Scanner(System.in);
    Computer laptop1 = new Laptop();

    public static void main(String[] args){
        System.out.println("=============START==============");
        Main interaction = new Main();
        interaction.process(interaction.menus());
        Main.main(args);
    }

    public int menus(){
        System.out.println("what do you need for testing the mechine :");
        System.out.println("1. Normal on");
        System.out.println("2. Un Normal Off");
        System.out.print("Chose : ");
        inputan.hasNext();
        return inputan.nextInt();
    }

    public void process(int chose){
        switch (chose){
            case 1:
                normalOn();
                break;
            case 2:
                killOff();
                break;
            default:
                System.out.println("out of menu");
        }
    }

    public void normalOn(){
        laptop1.plugPower();
        laptop1.on();
        System.out.println("My computer status is : " + (laptop1.status() ? "on" : "off"));
    }

    public void killOff(){
        laptop1.unPlugPower();
    }
}
