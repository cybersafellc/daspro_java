package main.com.vehicle.v1.blueprints;

public class Kendaraan implements main.com.vehicle.v1.interfaces.Kendaraan {
    private String platNumber;
    private String color;
    private String nama;

    public void sound() {
        System.out.println(sound);
    }

    public String getColor() {
        return color;
    }

    public String getPoliceNumber(){
        return platNumber;
    }

    public String getNama(){
        return nama;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPoliceNumber(String pNumber) {
        this.platNumber = pNumber;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
