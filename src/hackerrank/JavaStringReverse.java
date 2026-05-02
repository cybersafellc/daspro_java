package hackerrank;

import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.hasNext();
        String input = scan.nextLine();
        String reverseInput = "";
        for(int i = 0; i < input.length(); i++){
            reverseInput = input.charAt(i) + reverseInput;
        }
        if(reverseInput.equals(input)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
