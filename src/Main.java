import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner input=new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matematik= input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik= input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya= input.nextInt();

        System.out.println("Turkce Notunuz: ");
        turkce= input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih= input.nextInt();

        System.out.println("Muzik Notunuz: ");
        muzik= input.nextInt();

        int toplam=matematik+fizik+kimya+tarih+tarih+muzik;
        double sonuc= toplam/6.0;

        System.out.println("Ortalamaniz :" +sonuc);

        boolean kosul= sonuc>=60;
        String str= kosul ? "Sinifi Gecti" : "Sinifta Kaldi65";
        System.out.println(str);

    }
}

