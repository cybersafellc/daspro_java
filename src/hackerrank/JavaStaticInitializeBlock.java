package hackerrank;

import java.util.Scanner;

public class JavaStaticInitializeBlock {
    public static int b;
    public static int h;
    public static Scanner scan;
    public static String resMess;

    static {
        scan = new Scanner(System.in);
        scan.hasNext();
        b = scan.nextInt();
        scan.hasNext();
        h = scan.nextInt();
        scan.close();
        resMess = "Breadth and height must be positive";
    }

    public static void main(String[] args){
        try {
            if(b <= 0 || h <= 0){
                throw new Exception(resMess);
            }
            System.out.println(b * h);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
