import java.util.Scanner;

public class RestoranApp {

    public static Scanner inputUser = new Scanner(System.in);
    public static String[] menu = {"Cah Kangkung", "Jagung Bakar", "Tumis Buncis"};
    public static int[] price = {8000, 6000, 12000};
    public static String[] cahKangkungArr = new String[20];
    public static String[] jagunBakarArr = new String[20];
    public static String[] tumisBuncisArr = new String[20];
    public static int cahKangkung, jagungBakar, tumisBuncis, result1, result2, result3, jumlahYangHarusDiBayar, number;
    public static String chooseMenu;

    public static String outputScan(String index){
        System.out.print(index + " : ");
        return inputUser.nextLine();
    }

    public static void viewCheckoutApp(){
        System.out.println("\n                          INVOICE PEMBELIAN RESTORAN SEMOGA SEHAT");
        System.out.println("===========================================================================================");
        System.out.println("No      Nama Menu               Harga                 Jumlah                  Sub Total");
        System.out.println("===========================================================================================");
        if (cahKangkungArr[0] != null){
            number++;
            System.out.println((number) + ".\t\t" + cahKangkungArr[0] + "\t\t\tRp." + price[0] + "\t\t\t\t\t" + cahKangkung + "\t\t\t\t\t  Rp." + result1);
        }
        if (jagunBakarArr[0] != null){
            number++;
            System.out.println((number) + ".\t\t" + jagunBakarArr[0] + "\t\t\tRp." + price[1] + "\t\t\t\t\t" + jagungBakar + "\t\t\t\t\t  Rp." + result2);
        }
        if (tumisBuncisArr[0] != null){
            number++;
            System.out.println((number) + ".\t\t" + tumisBuncisArr[0] + "\t\t\tRp." + price[2] + "\t\t\t\t" + tumisBuncis + "\t\t\t\t\t  Rp." + result3);
        }
        System.out.println("===========================================================================================");
        jumlahYangHarusDiBayar = result1 + result2 + result3;
        System.out.println("Total Bayar : Rp." + jumlahYangHarusDiBayar);
    }
    public static void viewShowApp(){
        while(true) {
            System.out.println("\n===============================================================");
            System.out.println("~~~~~~~~~~Daftar Menu Restoran Semoga Sehat Indonesia~~~~~~~~~~");
            System.out.println("===============================================================");
            System.out.println("1. " + menu[0] + "   :   Rp. " + price[0]);
            System.out.println("2. " + menu[1] + "   :   Rp. " + price[1]);
            System.out.println("3. " + menu[2] + "   :   Rp. " + price[2]);
            chooseMenu = outputScan("Masukkan Pilihan Menu Anda (x jika ingin checkout pesanan)");
            switch (chooseMenu){
                case "1" -> {
                    for (int i = 0; i < cahKangkungArr.length; i++) {
                        if (cahKangkungArr[i] == null){
                            cahKangkungArr[i] = menu[0];
                        }
                    }
                    cahKangkung = Integer.parseInt(outputScan("\nJumlah " + menu[0] + " Yang Dipesan"));
                    result1 = price[0] * cahKangkung;
                }
                case "2" -> {
                    for (int i = 0; i < jagunBakarArr.length; i++) {
                        if (jagunBakarArr[i] == null){
                            jagunBakarArr[i] = menu[1];
                        }
                    }
                    jagungBakar = Integer.parseInt(outputScan("\nJumlah " + menu[1] + " Yang Dipesan"));
                    result2 = price[1] * jagungBakar;
                }
                case "3" -> {
                    for (int i = 0; i < tumisBuncisArr.length; i++) {
                        if (tumisBuncisArr[i] == null){
                            tumisBuncisArr[i] = menu[2];
                        }
                    }
                    tumisBuncis = Integer.parseInt(outputScan("\nJumlah " + menu[2] + " Yang Dipesan"));
                    result3 = price[2] * tumisBuncis;
                }
                case "x" -> {
                    viewCheckoutApp();
                    System.exit(100);
                }
            }
        }
    }

    public static void main(String[] args) {
        viewShowApp();
    }
}
