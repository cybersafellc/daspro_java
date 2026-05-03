package main.com.computer.v1.superclass;

public class Computer implements main.com.computer.v1.interfaces.Computer {
    protected boolean status = false;
    protected boolean power = false;

    @Override
    public void on(){
        if(!power){
            System.out.println("Computer dont have power, please plug the power");
            return;
        }
        if(status){
            System.out.println("the computer has on, what do you want?");
            return;
        }
        this.status = true;
        System.out.println("Computer successfully on");
    }

    @Override
    public void off() {
        if(!status){
            System.out.println("the computer has off, you can't double off on your mechine");
            return;
        }
        this.status = false;
        System.out.println("computer successfully off");
    }

    @Override
    public void plugPower() {
        if(!power){
            this.power = true;
            System.out.println("power successfully plug");
            return;
        }
        System.out.println("power has plug");
    }

    @Override
    public void unPlugPower() {
        this.status = false;
        this.power = false;
        System.out.println("the computer off and un plug power");
    }

    @Override
    public boolean status() {
        return this.status;
    }

    @Override
    public void openBrowser(){
        if(!status || !power){
            System.out.println("can't open the browser because your computer not plug power or off status");
            return;
        }
        System.out.println("launch browser");
    }
}
