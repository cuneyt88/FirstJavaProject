import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat, muzik, fizik, kimya, tarih, turkce;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Türkce notunuz: ");
        turkce = inp.nextInt();

        int toplam=(mat+muzik+fizik+kimya+tarih+turkce);
        double sonuc=toplam/6.0;
        System.out.println("Ortalamanız: "+sonuc);

        if (sonuc >= 60) {
            System.out.println("Geçtiniz!");
        } else {
            System.out.println("Kaldınız :(");
        }
    }
}