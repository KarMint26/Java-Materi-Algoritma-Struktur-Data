import java.util.Scanner;

public class Makanan {
    public static Scanner input = new Scanner(System.in);
    public static int InputUser;

    public static void main(String[] args) {
        // Starts Program

        // Variable Makanan
        String a = "Nasi Goreng";
        String b = "Nasi Padang";
        String c = "Nasi Lengko";
        String d = "Nasi Uduk";
        String e = "Nasi Opor Ayam";
        String f = "Nasi Bakar";
        String g = "Exit Menu";

        // Variable Quantity
        int QtyMenuA = 0;
        int QtyMenuB = 0;
        int QtyMenuC = 0;
        int QtyMenuD = 0;
        int QtyMenuE = 0;
        int QtyMenuF = 0;

        // View Product

        do {
            System.out.println("\n   Warung Makan Sehat Sentosa");
            System.out.println("================================");
            System.out.println("\nSelamat Datang Di Warung Kami");
            System.out.println("Berikut Daftar Makanan Yang Ada ");

            System.out.println("1. " + a);
            System.out.println("2. " + b);
            System.out.println("3. " + c);
            System.out.println("4. " + d);
            System.out.println("5. " + e);
            System.out.println("6. " + f);
            System.out.println("7. " + g);

            System.out.print("\nMasukkan Pilihan Anda : ");
            InputUser = input.nextInt();

            switch (InputUser){
                case 1 -> {
                    System.out.print("Jumlah " + a + " yang di pesan  : ");
                    QtyMenuA = input.nextInt();
                    System.out.println("Terimakasih Telah Memesan " + a);
                }
                case 2 -> {
                    System.out.print("Jumlah " + b + " yang di pesan  : ");
                    QtyMenuB = input.nextInt();
                    System.out.println("Terimakasih Telah Memesan " + b);
                }
                case 3 -> {
                    System.out.print("Jumlah " + c + " yang di pesan  : ");
                    QtyMenuC = input.nextInt();
                    System.out.println("Terimakasih Telah Memesan " + c);
                }
                case 4 -> {
                    System.out.print("Jumlah " + d + " yang di pesan  : ");
                    QtyMenuD = input.nextInt();
                    System.out.println("Terimakasih Telah Memesan " + d);
                }
                case 5 -> {
                    System.out.print("Jumlah " + e + " yang di pesan  : ");
                    QtyMenuE = input.nextInt();
                    System.out.println("Terimakasih Telah Memesan " + e);
                }
                case 6 -> {
                    System.out.print("Jumlah " + f + " yang di pesan  : ");
                    QtyMenuF = input.nextInt();
                    System.out.println("Terimakasih Telah Memesan " + f);
                }
                case 7 -> {
                    System.out.println("\n    Terimakasih Telah Datang di Warung Kami");
                    System.out.println("           Jangan Lupa Datang Kembali");
                    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                    System.out.println("\nBerikut Daftar Pesanan Anda");
                }
            }

        }while (InputUser <= 6);{
            if (!a.isBlank() && QtyMenuA!=0){
                System.out.println("1. " + a + " Telah Dipesan Sebanyak " + QtyMenuA);
            }
            if (!b.isBlank() && QtyMenuB!=0){
                System.out.println("2. " + b + " Telah Dipesan Sebanyak " + QtyMenuB);
            }
            if (!c.isBlank() && QtyMenuC!=0){
                System.out.println("3. " + c + " Telah Dipesan Sebanyak " + QtyMenuC);
            }
            if (!d.isBlank() && QtyMenuD!=0){
                System.out.println("4. " + d + " Telah Dipesan Sebanyak " + QtyMenuD);
            }
            if (!e.isBlank() && QtyMenuE!=0){
                System.out.println("5. " + e + " Telah Dipesan Sebanyak " + QtyMenuE);
            }
            if (!f.isBlank() && QtyMenuF!=0){
                System.out.println("6. " + f + " Telah Dipesan Sebanyak " + QtyMenuF);
            }
        }

        System.out.println();

        // Ends Program
    }
}
