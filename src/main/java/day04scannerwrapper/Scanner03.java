package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Ornek : kullanicidan iki sayi alip dort islem yapan ve islemlerin sonuclarini ekrana yazadiran kodu olusturunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");

        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);
        





    }
}
