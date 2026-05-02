package hackerrank;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n){
        if(n == 1) return 1;
        ArrayList<Integer> divisorsum = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisorsum.add(i);
            }
        }
        int sums = 0;
        for(int d : divisorsum){
            sums += d;
        }
        return sums;

    }
}

public class JavaInterface {

    public static void main(String[] args) {
        System.out.println("I implemented: AdvancedArithmetic");
        AdvancedArithmetic obj = new MyCalculator();
        Scanner scan = new Scanner(System.in);
        scan.hasNext();
        System.out.println(obj.divisor_sum(scan.nextInt()));
    }
}