package blueprints;

public class Mobil extends Kendaraan{
    private String sound = "stutututut";

    @Override
    public void sound() {
        System.out.println(sound);
    }
}
