import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("--- Manav Kasa Programı---");

        //Meyveler KG ve Fiyatları

         double PEAR_PRICE = 2.14;
         double APPLE_PRICE = 3.67;
         double TOMATOES_PRICE = 1.11;
         double BANANA_PRICE = 0.95;
         double EGGPLANT_PRICE = 5.0;

        double toplamTutar = 0;
        double armutKg = 0, armutFiyat = 0, elmaKg = 0, elmaFiyat = 0;
        double domatesKg = 0, domatesFiyat = 0, muzKg = 0, muzFiyat= 0;
        double patlicanKg = 0, patlicanFiyat = 0;

        //input

        System.out.println("Armut Kaç Kilo ? :");
        armutKg = input.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        muzKg = input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        patlicanKg = input.nextDouble();
        input.close();

        armutFiyat = armutKg * PEAR_PRICE;
        elmaFiyat = elmaKg * APPLE_PRICE;
        domatesFiyat = domatesKg * TOMATOES_PRICE;
        muzFiyat = muzKg * BANANA_PRICE;
        patlicanFiyat = patlicanKg * EGGPLANT_PRICE;


        toplamTutar= armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
        System.out.format("Toplam Tutar: %.2f\n", toplamTutar);



    }
}

