import java.util.Scanner;

public class ortalama2 {

    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz;
        try (Scanner inp = new Scanner(System.in)) {
            int dersCount = 0;
            System.out.print("Matematik notunu girin :");
            mat = inp.nextInt();
            if (mat >= 0 && mat <= 100) {
                ++dersCount;
                System.out.println("Ders sayısı :"+dersCount);
            } else {
                mat = 0;
                System.out.println("Matematik notunuz  :" + mat);
            }

            System.out.println("Fizik notunu girin :");
            fiz = inp.nextInt();
            if (fiz >= 0 && fiz <= 100) {
                ++dersCount;
                System.out.println("Ders sayısı :"+dersCount);
            } else {
                fiz = 0;
                System.out.println("Fizik notunuz  :" + fiz);
            }

            System.out.println("Türkçe notunu girin :");
            turk = inp.nextInt();
            if (turk >= 0 && turk <= 100) {
                ++dersCount;
                System.out.println("Ders sayısı :"+dersCount);
            } else {
                turk = 0;
                System.out.println("Türkçe notunuz  :" + turk);
            }

            System.out.println("Kimya notunu girin :");
            kim = inp.nextInt();
            if (kim >= 0 && kim <= 100) {
                ++dersCount;
                System.out.println("Ders sayısı :"+dersCount);
            } else {
                kim = 0;
                System.out.println("Kimya notunuz  :" + kim);

            }

            System.out.println("Müzik notunu girin :");
            muz = inp.nextInt();
            if (muz >= 0 && muz <= 100) {
                ++dersCount;
                System.out.println("Ders sayısı :"+dersCount);
            } else {
                muz = 0;
                System.out.println("Müzik notunuz  :" + muz);
            }
            if (dersCount==0){
                System.out.println("Ders sayısı sıfır olduğu için ortalama hesaplanamıyor. Program sonlandırılıyor.");
                return;
            }
            double ort = (mat + muz + fiz + turk + kim) / dersCount;
            if (ort < 55) {
                System.out.println("Üzgünüm kaldınız...");
            } else {
                System.out.println("Tebrikler geçtiniz.");
                
            }
            System.out.println("Ders ortalamanız  :" + ort);
        }

    }
}