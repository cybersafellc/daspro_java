import java.util.Scanner;
import java.util.Random;
import java.util.UUID;

public class HaloDunia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Halo World");
        System.out.println("Masukkan Nama anda Bung :");
        String namaBung = input.nextLine();
        System.out.println("Nama bung adalah : " + namaBung);
//
        Random rand = new Random();
        int angkaRandom = rand.nextInt(100);
        System.out.println("ID bung :" + angkaRandom);
//
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID : " + uuid);
    }
}
