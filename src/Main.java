import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.print("Hava Sicakligini Giriniz :");
        sicaklik = input.nextInt();

        if (sicaklik>=30) {
            System.out.println("Bu Havada Yuzmeye Gidilir");
        }else if (sicaklik>=5 && sicaklik<=30) {
            System.out.println("Bu Havada Sinemaya Gidilir");
        }else {
            System.out.println("Bu Havada Kayak Yapmaya Gidilir");
        }

    }
}