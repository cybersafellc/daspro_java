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

class Result {

    public static String findDay(int month, int day, int year) {
        String[] days = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        Calendar time = Calendar.getInstance();
        time.set(year, month - 1, day);
        return days[time.get(Calendar.DAY_OF_WEEK)];
    }

}
public class JavaDateandTime {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        scan.hasNext();
        String[] firstMultipleInput = scan.nextLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }
}
