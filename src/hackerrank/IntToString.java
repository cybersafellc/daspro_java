package hackerrank;

import java.util.Scanner;

public class IntToString {
    public static int n;
    public static Scanner scan;

    static {
        scan = new Scanner(System.in);
        scan.hasNext();
        n = scan.nextInt();
    }

    public static void main(String[] args){
        try {
            String cvInt = String.valueOf(n);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
