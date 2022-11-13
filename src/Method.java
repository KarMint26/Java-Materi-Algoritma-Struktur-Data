import java.util.Scanner;

public class Method {

    public static String Nm;

    public static int umur, Bil, prima;

    public static Scanner inputUser = new Scanner(System.in);

    public static boolean bilanganPrima;

    public static int[] nilaiMataKuliah = new int[9];

    public static String[] namaMataKuliah = {
      "Konsep Teknologi Informasi", "Bahasa Indonesia", "Sistem Operasi",
      "Bahasa Inggris", "Algoritma dan Struktur Data", "Organisasi dan Arsitektur Komputer",
      "Logika Informatika", "Kalkulus", "Pendidikan Agama"
    };

    public static void main(String[] args) {

        System.out.println("\n          METHOD dan PENERAPANNYA");
        System.out.println("      Array di dalam penerapan method");
        System.out.println("*******************************************");
        System.out.print("\nMasukkan Nama Anda : ");
        String identitas = inputUser.nextLine();
        System.out.println("\n   Masukkan Daftar Nilai Anda dibawah ini");
        System.out.println("============================================");
        for (int i = 0; i < nilaiMataKuliah.length; i++) {
            int no = i + 1;
            System.out.print(no + ". " + namaMataKuliah[i] + ", nilai anda : ");
            nilaiMataKuliah[i] = inputUser.nextInt();
        }
        System.out.println();

        Array(identitas, nilaiMataKuliah);

        //Array("Karel", 90,70,80,75,77);
        System.out.println();

        System.out.println("\nPROGRAM SCANNER PADA METHOD");
        System.out.print("Masukkan Nama Anda : ");
        Nm = inputUser.nextLine();

        System.out.print("Masukkan Umur Anda : ");
        umur = inputUser.nextInt();

        cobaScanner(Nm, umur);

        System.out.println("\nFAKTORIAL MENGGUNAKAN METHOD");
        System.out.print("Masukkan Bilangan Bulat : ");
        Bil = inputUser.nextInt();

        factorial(Bil);
        System.out.println();
        System.out.println("Recursive Method");
        System.out.println(recursiveFactorial(Bil));

        System.out.println("\nPROGRAM PENGECEKAN BILANGAN PRIMA");
        System.out.print("Masukan Angka : ");
        prima = inputUser.nextInt();

        bilPrima(prima);

        System.out.println();
    }

    public static void Array(String nama, int...values) {
        int totalNilai = 0;
        int hasilRataRata = 0;
        for (int count : values) {
            totalNilai += count;
            hasilRataRata = totalNilai / values.length;
        }

        String lulus = (hasilRataRata >= 80) ? "Selamat Anda Lulus" : "Maaf Anda Tidak Lulus";
        System.out.println(nama + " dinyatakan " + lulus);

    }

    public static void cobaScanner(String Name, int Age){
        System.out.println("Nama kamu adalah " + Name + " dan kamu berumur " + Age + " Tahun");
    }

    public static void factorial(int number){
        var faktorial = 1;
        for (int i = 1; i <= number; i++) {
            faktorial *= i;
        }
        System.out.println("Hasil Pemfaktoran Dari Bilangan Bulat " + number + " adalah " + faktorial);
    }

    public static int recursiveFactorial(int num){
        if (num == 1){
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }

    public static void bilPrima(int bilanganBulat){
        bilanganPrima = true;
        if (bilanganBulat == 0 || bilanganBulat == 1){
            bilanganPrima = false;
        }else {
            for (int i = 2; i <= bilanganBulat / 2; i++) {
                if (bilanganBulat % i == 0) {
                    bilanganPrima = false;
                    break;
                }
            }
        }
        var yangPrima = (bilanganPrima) ? "Merupakan Bilangan Prima" : "Bukan Bilangan Prima";
        System.out.println("Hasilnya " + yangPrima);
    }
}
