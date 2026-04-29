package hackerrank;

import java.util.Scanner;

public class StdInStdOut2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inputInteger = scanner.nextInt();
        double inputDouble = scanner.nextDouble();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputDouble);
        System.out.println("Int: " + inputInteger);
    }
}
