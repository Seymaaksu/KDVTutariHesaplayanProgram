import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Tutarı giriniz:");
        double tutar;
        tutar = scan.nextDouble();
        boolean durum = tutar>0 && tutar<1000;
        double sonuc = durum ? tutar+tutar*0.18 : tutar+tutar*0.08;
        System.out.println("Tutar:" + tutar);
        System.out.println("KDV'li Tutar:");
        System.out.println(sonuc);



    }
}