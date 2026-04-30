package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args){
        String covers = "================================";
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            input.add(scanner.nextLine());
        }
        scanner.close();
        System.out.println(covers);
        for(int i = 0; i < 3; i++){
            JavaOutputFormatting.view(input.get(i).split(" "));
        }
        System.out.println(covers);

    }
    public static void view(String[] args){
        String space = "";
        int number1 = Integer.parseInt(args[1]);
        for(int i = 0; i < 15 - args[0].length(); i ++){
            space += " ";
        }
        if(number1 < 100){
            if (number1 > 9) {
                System.out.println(args[0] + space + "0" + number1);
            } else {
                System.out.println(args[0] + space + "00" + number1);
            }
        }else{
            System.out.println(args[0] + space + number1);
        }
    }
}
