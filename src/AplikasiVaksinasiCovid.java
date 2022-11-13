import java.util.Scanner;

public class AplikasiVaksinasiCovid {

    public static Scanner inputUser = new Scanner(System.in);

    public static String[] nameOfPeople = new String[180];

    public static void main(String[] args) {
        /*
          diketahui :
          1. vaksin yang disediakan untuk 180 orang
          2. ada 3 jenis vaksin yang disediakan, yaitu pfizer(50), sinopharm(60), moderna(70)
          3. buatlah aplikasi java untuk mendata pasien covid-19 beserta dengan jenis vaksinnya
          4. penentuan vaksin tersebut adalah RANDOM dari total 180 vaksin yang diberikan
          5. Setiap melakukan pendaftaran pasien, maka tampilkan informasi jumlah total vaksin
             yang telah dilakukan dan tampilkan sisanya.
          6. Menggunakan Method 1 dan Method 2 serta Array
         */
        System.out.println();

        viewShowMenuVaccine();

        System.out.println();
    }

    public static String input(String index){
        System.out.print(index + " : ");
        return inputUser.nextLine();
    }

    public static void testInput(){
        String testA = input("Masukkan Nama Anda");
        String testB = input("Masukkan Umur Anda");

        System.out.println("Nama Anda Adalah " + testA);
        System.out.println("Umur Anda Adalah " + testB + " Tahun");
    }

    public static void viewShowMenuVaccine(){
        while (true){
            System.out.println("\n   PROGRAM VAKSINASI COVID-19 INDONESIA");
            System.out.println("==========================================");

            showVaccineData();
            System.out.println();

            System.out.println("1. Tambahkan Peserta Vaksin");
            System.out.println("2. Exit Aplikasi");
            String pilihan = input("Masukkan Pilihan Anda");
            System.out.println();

            if (pilihan.equals("1")){
                viewAddVaccineData();
            } else if (pilihan.equals("2")) {
                break;
            } else {
                System.out.println("Pilihan Anda salah");
            }
        }
    }

    public static void testViewShowMenuVaccine(){
        viewShowMenuVaccine();
    }

    public static void viewAddVaccineData(){
        System.out.println(" Selamat Datang di Menu Pendaftaran");
        System.out.println("====================================");
        String peserta = input("Masukkan Nama Pendaftar Vaksin Covid-19");
        addVaccineData(peserta);
    }

    public static void showVaccineData(){
        for (int i = 0; i < nameOfPeople.length; i++) {
            if (nameOfPeople[i] != null){
                System.out.println("Nama Pendaftar Vaksin ke-" + (i+1) + " " + nameOfPeople[i]);
            } else {
                break;
            }
        }

        for (int i = 0; i < nameOfPeople.length; i++) {
            if (nameOfPeople[i] == null){
                System.out.println("Total Sisa Orang Yang Belum di Vaksin adalah : " + nameOfPeople.length);
            }
        }
    }

    public static void testShowVaccineData(){
        nameOfPeople[0] = "Karel Trisnanto Utomo";
        nameOfPeople[1] = "Florentina Nathania";
        nameOfPeople[2] = "Natasha Angelina";

        showVaccineData();
    }

    public static void addVaccineData(String data){
        for (int i = 0; i < nameOfPeople.length; i++) {
            if (nameOfPeople[i] == null){
                nameOfPeople[i] = data;
                break;
            }
        }
    }

    public static void testAddVaccineData(){
        viewAddVaccineData();
        System.out.println();

        showVaccineData();
    }
}
