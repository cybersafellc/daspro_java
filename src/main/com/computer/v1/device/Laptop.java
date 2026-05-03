package main.com.computer.v1.device;

import main.com.computer.v1.superclass.Computer;
import java.util.Scanner;

public class Laptop extends Computer {
    private String brand;
    private String model;
    private Scanner input = new Scanner(System.in);

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setMode(String model){
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    @Override
    public void unPlugPower(){
        System.out.println("are you sure to off your mechine : Y for process or Any key for cancel");
        input.hasNext();
        String isPressY = input.nextLine();
        if(isPressY.equals("Y") || isPressY.equals("y")){
            this.status = false;
            this.power = false;
            System.out.println("your computer is die");
            return;
        }
        System.out.println("Thankyou for safe your computer");
    }
}
