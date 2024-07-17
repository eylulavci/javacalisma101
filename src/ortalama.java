import java.util.Scanner;

public class ortalama {public static void main(String[] args) {
//Değişkenleri oluştur.
    int mat, fizik, kimya, turkce, tarih, muzik ;

    //Scanner sınıfımızı tanımla.

    Scanner input = new Scanner(System.in) ;

    //kullanıcıdan değerleri al.
    System.out.print("Matematik Notunuz : ");
    mat = input.nextInt();

    System.out.print("Fizik Notunuz : ");
    fizik = input.nextInt();

    System.out.print("Kimya Notunuz : ");
    kimya = input.nextInt();

    System.out.print("Türkçe Notunuz : ");
    turkce = input.nextInt();

    System.out.print("Tarih Notunuz : ");
    tarih = input.nextInt();

    System.out.print("Müzik Notunuz : ");
    muzik = input.nextInt();

    int toplam = (mat + fizik + kimya + turkce + tarih + muzik ) ;
    double ortalama = toplam / 6.0 ;

  String sonuc = (ortalama > 60) ? "Failed. :( " : "Passed. :) ";
    System.out.println(sonuc);
}
}
