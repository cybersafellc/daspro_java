import java.util.Scanner;


class Calculator{
    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Masukkan Nilai Pertama : ");
            float num1 = scan.nextFloat();
            System.out.println("Masukkan Nilai Kedua : ");
            float num2 = scan.nextFloat();
            scan.nextLine();
            System.out.println("Masukkan Nilai Math Operator : ");
            String opr = scan.nextLine();
            float hasil;
            switch(opr){
                case "*":
                    hasil = num1 * num2;
                break;
                case ":":
                    hasil = num1 / num2;
                break;
                case "+":
                    hasil = num1 + num2;
                break;
                case "-":
                    hasil = num1 - num2;
                break;
                default:
                    hasil = 0; 
            }
            System.out.println("Hasilnya adalah : " + hasil);
            scan.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}