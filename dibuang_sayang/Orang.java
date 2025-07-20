import java.util.Scanner;

class Orang{
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        print("Nama kamu Siapa ?");
        String nama = scan.nextLine();
        print("Nama Kamu adalah : " + nama);
        scan.close();
    }

    private static void print(String text){
        System.out.println(text);
    }
}