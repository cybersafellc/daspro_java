package tebak_angka;

import java.util.Scanner;

public class Angka {
    public static void main(String[] args){
        Scanner input = createInput();
        showText("Hello Selamat datang di Permainan Tebak angka");
        showText("Silahkan menebak angka dari 1 - 10 :");
        int number = generateRandomNumber(1, 10);
        int inputanUser = input.nextInt();
        showText("Angka yang di tebak : " + inputanUser);
        if(inputanUser == number){
            showText("Tebakan anda benar");
        }else {
            showText("Tebakan anda salah");
        }
    }
    private static Scanner createInput(){
        return new Scanner(System.in);
    }
    private static void showText(String text){
        System.out.println(text);
    }
    private static int generateRandomNumber(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}
