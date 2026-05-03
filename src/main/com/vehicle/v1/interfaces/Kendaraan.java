package main.com.vehicle.v1.interfaces;

public interface Kendaraan {
    String sound = "ZZZZZ";
    void sound();
    void setPoliceNumber(String pNumber);
    void setColor(String color);
    void setNama(String nama);
    String getPoliceNumber();
    String getColor();
    String getNama();
}
