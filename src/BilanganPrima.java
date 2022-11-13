import java.util.Scanner;

public class BilanganPrima {
    public static Scanner inputUser = new Scanner(System.in);
    public static int Bil;
    public static boolean boolPrima;

    public static void main(String[] args) {
        // Program Starts

        // Cek apakah bilangan nya adalah bilangan Prima

        System.out.println("\n    PROGRAM HITUNG BILANGAN PRIMA");
        System.out.println("=====================================");

        System.out.print("\nMasukkan Bilangan Bulat : ");
        Bil = inputUser.nextInt();

        boolPrima = true;
        if (Bil == 0 || Bil == 1){
            boolPrima = false;
        } else {
            for (int a = 2; a <= Bil / 2; a++){
                if (Bil % a == 0) {
                    boolPrima = false;
                    break;
                }
            }
        }

        // Use The Ternary Operator
        var counter = (boolPrima) ? "Adalah Bilangan Prima" : "Bukan Bilangan Prima";
        System.out.println("\nHasil Dari Pengecekan Bilangan " + Bil + " " + counter);

        System.out.println();

        // Program Ends
    }
}
