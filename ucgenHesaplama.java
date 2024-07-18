import java.util.Scanner ;
public class ucgenHesaplama {
    public static void main(String[] args) {

        int a, b, c ;
        Scanner input = new Scanner(System.in) ;

        System.out.println("1.Kenarı giriniz :");
        a = input.nextInt() ;
        System.out.println("2.Kenarı giriniz :");
        b = input.nextInt() ;
        System.out.println("3.Kenarı giriniz :");
        c = input.nextInt() ;

        double u = (a + b + c)/2 ;
        double alan = u * (u-a) * (u-b) *  (u-c) ;
        System.out.println("Alan = " + alan) ;
    }
}
