package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class IfElse {
    public static void main(String[] args) throws IOException {
        String[] message = {"Weird", "Not Weird"};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        boolean isOdd = N % 2 == 1 ? true : false;
        if(isOdd){
            System.out.println(message[0]);
        }else if(N >= 6 && N <= 20){
            System.out.println(message[0]);
        }else{
            System.out.println(message[1]);
        }
    }
}
