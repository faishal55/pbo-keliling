package week10;


import java.time.Period;
import java.util.Scanner;


public class Main{
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan panjang sisi: ");
        int sisi = scanner.nextInt();
        Persegi persegi = new Persegi(sisi);
        persegi.keliling();
        

        System.out.print("Masukkan panjang : ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = scanner.nextInt();
        Persegipanj persegipanj = new Persegipanj(panjang, lebar);
        persegipanj.keliling();


        System.out.print("Masukkan radius : ");
        int radius = scanner.nextInt();
        Lingkaran lingkaran = new Lingkaran(radius);
        System.out.println(lingkaran.keliling());


        System.out.print("Masukkan sisi : ");
        sisi = scanner.nextInt();
        System.out.print("Masukkan sisi : ");
        sisi = scanner.nextInt();
        System.out.print("Masukkan sisi : ");
        sisi = scanner.nextInt();
        Segitiga segitiga = new Segitiga(sisi, sisi, sisi);
        segitiga.keliling();
       
        
        scanner.close();
    }
}
    