package Java.AlgoritmaStrukturData.Karel.Pertemuan8;

import java.util.Arrays;
import java.util.Scanner;

public class Pertemuan_8 {

    public static Scanner scanner = new Scanner(System.in);
    public static int age;
    public static String name;

    private static String outputScan(String index){
        System.out.print(index + " : ");
        return scanner.nextLine();
    }

    private static int[] inputAngka(){
        return new int[]{
                1,2,3,5
        };
    }

    public static void main(String[] args) {

        name = outputScan("Masukkan Nama Anda");
        age = Integer.parseInt(outputScan("Masukkan Umur Anda"));

        System.out.println("\nNama Anda : " + name);
        System.out.println("Umur Anda : " + age);

        int[] angkaSaya = inputAngka();

        System.out.println("\nArrays to String");
        System.out.println(Arrays.toString(angkaSaya));

        System.out.println("\nFor Each");
        for (int n : angkaSaya){
            System.out.println("Angka Saya : " + n);
        }

        System.out.println("\nFor Loop");
        for (int i = 0; i < angkaSaya.length; i++) {
            System.out.println((i+1) + ". Angka-nya adalah : " + angkaSaya[i]);
        }

        System.out.println("\nIni Adalah Object Oriented Programming");
        System.out.println();
        Mahasiswa mahasiswa = new Mahasiswa("Karel Trisnanto Utomo", "22090120", "Teknik Informatika");

        mahasiswa.cetakKartu();
        mahasiswa.sayWelcome("Politeknik Harapan Bersama");

        System.out.println("\nObject Ke-2 dalam Class");
        Mahasiswa mahasiswa2 = new Mahasiswa("Florentina", "Sistem Informasi");

        mahasiswa2.cetakinfo();
        mahasiswa2.sayWelcome("Universitas Gadjah Mada");

    }
}
