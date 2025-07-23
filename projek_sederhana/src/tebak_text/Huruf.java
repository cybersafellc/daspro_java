package tebak_text;

import java.util.Random;
import java.util.Scanner;

public class Huruf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        char hurufDitebak = generateHuru();
        showText("[+] Silahkan Menebak Huruf A - Z : ");

        char inputanUser = input.next().charAt(0);
        showText("[+] Huruf Yang anda tebak adalah " + inputanUser);
        if(inputanUser == hurufDitebak){
            showText("[+] Benar");
        }else{
            showText("[+] Salah");
            showText("[+] Jawaban benarnya adalah : " + hurufDitebak);
        }
    }
    private static char generateHuru(){
        Random rand = new Random();
        return (char) ('A' + rand.nextInt(26));
    }
    private static void showText(String text){
        System.out.println(text);
    }
}
