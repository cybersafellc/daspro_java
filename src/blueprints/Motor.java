package blueprints;

public class Motor extends Kendaraan{
    private String sound = "brummmm";

    @Override
    public void sound() {
        System.out.println(sound);
    }
}
