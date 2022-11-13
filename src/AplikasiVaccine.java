import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class AplikasiVaccine {

    int jumlahVaksin = 3; // Pfizer,Sinopharm,Moderna
    static int totalJumlahPenerimaVaksin = 12; // Diubah sesuai soal
    public static String[] Pfizer = new String[4];
    public static String[] Sinopharm = new String[4];
    public static String[] Moderna = new String[4];

    public static void main(String[] args) {
        inputPasien();
    }

    public static void printInfoPasienVaksin(){
        int totalPfizer = 0;
        int totalSisaKuota = 0;
        for (int i = 0; i < Pfizer.length; i++) {
            if (Pfizer[i] != null){
                totalPfizer++;
            }
        }
        int totalSinopharm = 0;
        for (int i = 0; i < Sinopharm.length; i++) {
            if (Sinopharm[i] != null){
                totalSinopharm++;
            }
        }
        int totalModerna = 0;
        for (int i = 0; i < Moderna.length; i++) {
            if (Moderna[i] != null){
                totalModerna++;
            }
        }

        totalSisaKuota = totalJumlahPenerimaVaksin - totalPfizer - totalSinopharm - totalModerna;
        System.out.println("Total Pasien Pfizer: " + totalPfizer + " | Total Pasien Sinopharm: " + totalSinopharm + " | Total Pasien Moderna: " + totalModerna);
        System.out.println("Jumlah Seluruh Vaksin : " + totalJumlahPenerimaVaksin + " | Total Sisa Kuota: " + totalSisaKuota);
    }

    public static void checkIndexArray(String[] myArray, String pasien){
        int indexNow = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != null){
                indexNow = i + 1;
            }
        }

        if (indexNow < myArray.length){
            myArray[indexNow] = pasien;
        }
    }

    public static void simpanPasien(int angkaRandom, String pasien){
        switch (angkaRandom){
            case 1 -> {
                checkIndexArray(Pfizer, pasien);
                System.out.println("Anda Mendapat Vaksin Pfizer");
                printInfoPasienVaksin();
            }
            case 2 -> {
                checkIndexArray(Sinopharm, pasien);
                System.out.println("Anda Mendapat Vaksin Sinopharm");
                printInfoPasienVaksin();
            }
            case 3 -> {
                checkIndexArray(Moderna, pasien);
                System.out.println("Anda Mendapat Vaksin Moderna");
                printInfoPasienVaksin();
            }
        }
    }

    public static void inputPasien(){
        Scanner inputData = new Scanner(System.in);
        while(true){
            System.out.print("Nama Pasien : ");
            String namaPasien = inputData.nextLine();
            if (namaPasien.isBlank()){
                System.out.println("Nama Pasien Wajib Diisi");
                inputPasien();
            } else {
                Random hasilRandom = new Random();
                int jenisRandom = hasilRandom.nextInt(3) + 1;
                simpanPasien(jenisRandom, namaPasien);
            }
        }
    }
}
