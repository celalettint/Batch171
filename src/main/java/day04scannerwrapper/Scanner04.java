package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan bir dikdortgeninin iki kenar uzunlugunu aliniz
        //a) alanini hesaplayiniz==> kisa kenar * uzun kenar
        //b) cevresini hesaplayiniz==> 2* (kisa kenar + uzun kenar)
        Scanner input = new Scanner(System.in);
        System.out.println(" dikdortgenin kisa kenar uzunlugunu giriniz..");
        double shortside = input.nextDouble();

        System.out.println("dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longside = input.nextDouble();
        System.out.println(shortside*longside);
        System.out.println(2*shortside+2*longside);






    }
}
