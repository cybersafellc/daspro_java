package interfaces;

public interface Kendaraan {
    String sound = "ZZZZZ";
    void sound();
    void setPoliceNumber(String pNumber);
    void setColor(String color);
    String getPoliceNumber();
    String getColor();
}
