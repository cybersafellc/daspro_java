package part1; // 1 deklarasi Package

import java.util.Scanner; // 2 bagian import library

public class structure_dan_arsitektur { // bagian kelas utama
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama");
        String nama = scan.nextLine();
        System.out.println("Nama saya adalah " + nama);
        scan.close();
    }
}
