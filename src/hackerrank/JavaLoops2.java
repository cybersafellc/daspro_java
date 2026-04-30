package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalQ = scanner.nextInt();
        ArrayList<String> solutions = new ArrayList<>();
        for(int i = 0; i < totalQ; i++){
            int[] num = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
            int totalSum = num[0];
            int totalX = 1;
            String solution = "";
            for(int j = 1; j <= num[2]; j++){
                totalSum += + totalX * num[1];
                solution += totalSum + " ";
                totalX *= 2;
            }
            solutions.add(solution);
        }
        for(String sol : solutions){
            System.out.println(sol);
        }
    }
}
