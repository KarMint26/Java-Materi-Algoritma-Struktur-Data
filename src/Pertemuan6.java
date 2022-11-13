import java.util.Scanner;

public class Pertemuan6 {
    public static Scanner inputUser = new Scanner(System.in);

    public static void main(String[] args) {
        /**
         * Materi Hari Ini
         * Method = subroutines
         * Memecah suatu kode program menjadi bagian terkecil / modul-modul
         * Method adalah implementasi di dalam class (function yang di implementasikan di dalam class)
         * 4 model suatu method / kriteria nya :
         * 1. Method tidak mengembalikan suatu nilai setelah diproses(void) dan tidak menerima
         *    atau memiliki parameter.
         * 2. Public Static Void Perkalian(int a, int b).
         */

        for (int i = 1; i <= 3; i++){
            jumlah();
        }

        System.out.println();

        title("Cetak Hasil Perkalian Dengan Parameter");
        perkalian(8, 8);
    }

    public static void jumlah(){
        int a = 5;
        int b = 10;

        int jumlahSemua = a * b;
        System.out.println(jumlahSemua);
    }

    public static void perkalian(int a, int b){
        int jumlahPerkalian = a * b;
        System.out.println("Jumlah Seluruhnya adalah " + jumlahPerkalian);
    }

    public static void title(String title){
        System.out.println(title);
    }
}
