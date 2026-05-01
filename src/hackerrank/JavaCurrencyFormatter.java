package hackerrank;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class JavaCurrencyFormatter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        scan.hasNext();
        double val = scan.nextDouble();
        scan.close();
        Locale[] loc = {Locale.US, new Locale("en", "IN"), Locale.CHINA, Locale.FRANCE};
        for(Locale l : loc){
           System.out.println((l.getCountry() == "US" ? l.getCountry() : l.getDisplayCountry()) + ": " + NumberFormat.getCurrencyInstance(l).format(val).replace("₹", "Rs."));
        }
    }
}
