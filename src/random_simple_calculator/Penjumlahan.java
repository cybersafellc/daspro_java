package random_simple_calculator;

public class Penjumlahan {
    public int exec(int[] numbers){
        int counts = 0;
        for(int i = 0; i < numbers.length; i++){
            counts += numbers[i];
        }
        return counts;
    }
}
