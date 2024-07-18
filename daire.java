import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r;
        double a;
        double 𝜋 = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yarıçap giriniz :");
        r = input.nextInt();
        System.out.print("Lütfen merkez açı giriniz :");
        a = input.nextDouble();
        double alan = (𝜋 * (r*r) * a) / 360 ;
        System.out.println("Alan :"+alan);
    }
}
