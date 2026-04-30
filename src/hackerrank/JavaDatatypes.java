package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalQ = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> inputs = new ArrayList<>();
        String[] message = {" can be fitted in:", " can't be fitted anywhere."};
        for(int i = 0; i < totalQ; i++){
            inputs.add(scanner.nextLine());
        }
        for(String n : inputs){
            ArrayList<String> onWhat = new ArrayList<>();
            try {
                if(Long.parseLong(n) >= -128 && Long.parseLong(n) <= 127){
                    onWhat.add("byte");
                }
                if(Long.parseLong(n) >= -32768 && Long.parseLong(n) <= 32767){
                    onWhat.add("short");
                }
                if(Long.parseLong(n) >= -2147483648 && Long.parseLong(n) <= 2147483647){
                    onWhat.add("int");
                }
                if(Long.parseLong(n) >= Long.parseLong("-9223372036854775808" ) && Long.parseLong(n) <= Long.parseLong("9223372036854775807")){
                    onWhat.add("long");
                }
                System.out.println(n + message[0]);
                for (String on : onWhat){
                    System.out.println("* " + on);
                }
            } catch (Exception e) {
                System.out.println(n + message[1]);
            }
        }
    }

}
