package day03methodobjectcreationscanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur
        //"new" keywordu sifirdan yeni bir object olusturmak icin kullanilir.
        // Consructor Javada object leri olustrmak icin kuulanilan ozel bior methodtur.
        //Class ismi + object ismi + Assignment operator + "new" keywordu + Constructor
            Car            myCar            =                new             Car();
        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student Alican = new Student ();

        System.out.println("Alican.name = " + Alican.name);
        System.out.println("Alican.adress = " + Alican.adress);
        System.out.println("Alican.grade = " + Alican.grade);
        Alican.study();
        Alican.feed();

        /*
         Homework
         icinde isim ve yas variable lari ile teach methodu bulunan bir teacher objevct olusturun ve obje
         uzerinde bu ozellikleri kullanin.
         */
    }

}
