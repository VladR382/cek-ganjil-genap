package pkg20_ganjilgenap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai yang mau dicek : ");
        int angka = input.nextInt();
        int hasil = angka % 2;
        String kondisi = hasil == 0?"Genap":"Ganjil";
        System.out.println("Itu adalah angka " + kondisi);
    }
}
