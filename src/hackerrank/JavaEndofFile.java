package hackerrank;

import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while (scanner.hasNext()){
            System.out.println(num + " " + scanner.nextLine());
            num++;
        }
    }
}
