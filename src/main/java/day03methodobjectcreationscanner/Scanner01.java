package day03methodobjectcreationscanner;

//Javanin util kutuphanesinden scanner class import edildi.


import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1. Adim Scanner Class tan object olustur.
        Scanner input = new Scanner(System.in);

        //2. Adim kullaniciya ne istedigine dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz");
        //3. Adim KUllanicin verdigi bilgileri memory e giriniz.
        byte age = input.nextByte();
        System.out.println(age);
        System.out.println("age = " + age);
    }

}
