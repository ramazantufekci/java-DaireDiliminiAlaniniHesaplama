import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14,sonuc;
        int r,a;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r = girdi.nextInt();
        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        a = girdi.nextInt();
        sonuc = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı : "+sonuc);

    }
}
