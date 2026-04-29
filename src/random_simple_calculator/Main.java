package random_simple_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);

            Main.viewMessage();

            int inputan = Integer.parseInt(scanner.nextLine());
            if(Main.validation(inputan)){
                switch (inputan){
                    case 1:
                        System.out.println("exe perkalian");
                        break;
                    case 2:
                        System.out.println("exe pembagian");
                        break;
                    case 3:
                        System.out.println("exe penjumlahan");
                        break;
                    case 4:
                        System.out.println("exe pengurangan");
                        break;
                    default:
                        Main.main(new String[]{"call again"});
                }
            }else{
                throw new RuntimeException("please chose from menus");
            }
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
            Main.main(new String[]{"call again"});
        }


    }

    public static void viewMessage(){
        System.out.println("Selamat datang di aplikasi calculator sederhana : ");
        System.out.println("Silahkan pilih menu yang anda butuhkan : ");
        System.out.println("1. Perkalian");
        System.out.println("2. Pembagian");
        System.out.println("3. Penjumlahan");
        System.out.println("4. Pengurangan");
        System.out.println("Masukkan angka menu : ");
    }

    public static boolean validation(int number){
        return number > 0 && number <= 4 ? true : false;
    }
}
