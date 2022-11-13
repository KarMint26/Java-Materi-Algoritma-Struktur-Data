import java.util.Scanner;

public class JavaForLoop {
    public static Scanner Scan = new Scanner(System.in);
    public static String[] nameStudent = new String[5];

    public static void main(String[] args) {
        System.out.println("   PROGRAM MENGHITUNG NAMA MAHASISWA");
        System.out.println("=======================================");

        System.out.println();
        for (int x = 0; x < nameStudent.length; x++){
            System.out.print("Masukkan Nama Mahasiswa ke-" + (x+1) + " : ");
            nameStudent[x] = Scan.nextLine();
        }

        System.out.println("\n  Output Jumlah Character Pada Inputan Nama");
        System.out.println("=============================================");
        System.out.println();

        for (int y = 0; y < nameStudent.length; y++){
            System.out.println((y+1) + ". " + nameStudent[y] + " Jumlah Namanya Adalah " + nameStudent[y].length());
        }
    }
}
