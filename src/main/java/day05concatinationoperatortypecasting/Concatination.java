package day05concatinationoperatortypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Ornek 1: Bir String ve iki int variable olusturun. String degeri ile int lerin toplamini konsola yazdirirniz.

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//elma1011
        System.out.println(s+(a+b)); //elma21
        System.out.println(s+a*b);//elma 110
        System.out.println(a+b+s);//21 elma
        System.out.println(a+s+b);//10elma11

        //Java da "+" sembolu iki sayi arasinda kullanilirsa toplama islemi olur.
        //Java da "+" sembolu iki string veya bir sayi arasinda kullanilirsa concatination islemi olur.
        //Concatination islemi birlestirme yapar.
        //Concatination islemlerinde java matematikte islem onceligi kurallarini kullanir.
        /*
        1) once uslu sayilar
        2)parantez ici islemler yapilir
        3)carpma ve bolme islemleri yapilir
        4)toplama ve cikarma islemleri yapilir
        5) ayni oncelikli olanlarda soldan saga baslanir.
         */
        //Ornek 2: size string olarak verilen iki fiyatin toplamini ekrana yazdirin.
        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);


        //ValueOf string degerleri integere a cevirir.
        int toplamFiyat = Integer.valueOf(shirt)+Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Ornek 3: string olarak verilen iki fiyatin toplamini ekrana yazdiriniz.
        String tv = "$1100";
        String radio = "$300";
        System.out.println(tv+radio);
        int TotalPrice = Integer.valueOf(tv)+Integer.valueOf(radio);
        System.out.println(TotalPrice);
        //Note : valueOf () methodu tum karakterleri rakam olan stringleri sayilarar cevirir.
        //Eger valueOf methodu kullanilirken stringin icine rakam olmayan bir karakter koyarsaniz hata alirsiniz.
        // Bu tarz hatalari duzeltmeyi ilerleyen derslerde ogrenecegiz.
        // valueOf methodu kullanilirken sadece rakam olan karakterler kullanilmalidir.
    }
}
