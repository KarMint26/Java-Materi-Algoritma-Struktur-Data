import java.util.Scanner;

public class Faktorial {
    public static Scanner inputUser = new Scanner(System.in);
    public static int count;

    public static void main(String[] args) {
        // Program Starts

        // Variable Declaration
        int Factorial = 1;

        System.out.println("\n   PROGRAM MENGHITUNG FAKTORIAL");
        System.out.println("==================================");

        System.out.print("\nMasukkan Bilangan Bulat : ");
        count = inputUser.nextInt();

        for (int i = 1; i <= count; i++){
            Factorial *= i;
        }

        System.out.println("Hasil Faktorial dari " + count + " Adalah " + Factorial);

        System.out.println();

        // Program Ends
    }
}
