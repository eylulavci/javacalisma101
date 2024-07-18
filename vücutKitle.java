import java.util.Scanner;

public class vücutKitle {
    public static void main(String[] args) {
        double kg , m ,vucutEndeks;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Lütfen kilonunu giriniz :");
        kg = input.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        m = input.nextDouble();
        vucutEndeks = kg / (m * m) ;
        System.out.println("Vücut kitle indexiniz:" +vucutEndeks);
    }
}
