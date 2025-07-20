public class WaveSorting {
    public static void main(String[] args){
        int[] notWaveNum = {1, 2, 34, 4, 5, 5, 5, 65, 6, 65, 5454, 4};
        int[] waveNum = {4, 1, 7, 5, 6, 2, 3};
        Check(waveNum);
    }
    private static void Check(int[] array){
        boolean lebihBesar = true;
        for(int i = 0; i < array.length; i++){
            if(i == array.length - 1){
                System.out.println("Is Wave");
                break;
            }
            if(lebihBesar){
                if(array[i] >= array[i + 1]){
                    lebihBesar = false;
                    continue;
                }else{
                    System.out.println("Is Not Wave !");
                    break;
                }
            }else{
                if(array[i] <= array[i + 1]){
                    lebihBesar = true;
                    continue;
                }else{
                    System.out.println("Is Not Wave !");
                    break;
                }
            }
        }
    }
}