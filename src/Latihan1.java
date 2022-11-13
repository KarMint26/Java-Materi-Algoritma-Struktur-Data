import java.util.Scanner;

public class Latihan1{

    public static Scanner inputUser = new Scanner(System.in);

    public static String[] bookStore = new String[10];

    public static void main(String[] args) {

        // Program Start

        testRemoveListBook();

        // Program End
    }

    public static void showListBook(){
        System.out.println("\nLIST BOOK QUERY STORE");
        for (int i = 0; i < bookStore.length; i++) {
            String book = bookStore[i];
            int num = i + 1;

            if (bookStore[i] != null){
                System.out.println(num + ". " + book);
            }
        }
    }

    public static void testShowListBook(){
        for (int i = 0; i < bookStore.length; i++) {
            int number = i + 1;
            String value = input(number + ". " + "Input Book Name");
            bookStore[i] = value;
        }
        showListBook();
    }

    public static void addListBook(String book){
        for (int i = 0; i < bookStore.length; i++) {
            if (bookStore[i] == null){
                bookStore[i] = book;
                break;
            }
        }
    }

    public static void testAddListBook(){
        for (int i = 0; i < bookStore.length; i++) {
            int numb = i + 1;
            String input = input(numb + ". " + "Input Book");
            addListBook(input);
        }
        showListBook();
    }

    public static boolean removeListBook(int number){
        if ((number - 1) >= bookStore.length){
            return false;
        } else if (bookStore[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < bookStore.length; i++) {
                if (i == bookStore.length - 1){
                    bookStore[i] = null;
                } else {
                    bookStore[i] = bookStore[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveListBook(){
        bookStore[0] = "MATEMATIKA";
        bookStore[1] = "INDONESIA";
        bookStore[2] = "EKONOMI";
        bookStore[3] = "PENDIDIKAN KEWARGANEGARAAN";

        removeListBook(2);

        showListBook();
    }

    public static void viewListBook(){

        while (true){
            showListBook();

            System.out.println("\n    Book Store Indonesia");
            System.out.println("============================");
            System.out.println("\n1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Exit from book store");

            String data = input("Input your Choose");
            if (data.equals("1")){
                viewAddListBook();
            } else if (data.equals("2")) {
                viewRemoveListBook();
            } else if (data.equals("3")){
                break;
            } else {
                System.out.println("Sorry Your Choose Wrong");
            }
        }

    }


    public static void testViewListBook(){
        bookStore[0] = "Math's Book";
        bookStore[1] = "Physic's Book";
        viewListBook();
    }

    public static String input(String index){
        System.out.print(index + " : ");
        String in = inputUser.nextLine();
        return in;
    }

    public static void testInput(){
        String name = input("Nama");
        System.out.println("Hi " + name);

        String country = input("Negara");
        System.out.println("Ohh " + country);
    }

    public static void viewAddListBook(){
        System.out.println("\nADD BOOk");

        var chooseBook = input("Input Book you Want (x if you want exit)");
        if (chooseBook.equals("x")){
            // cancel
        } else {
            addListBook(chooseBook);
        }
    }

    public static void  testViewAddListBook(){
        viewAddListBook();
        showListBook();
    }

    public static void viewRemoveListBook(){
        System.out.println("\nREMOVE BOOK");
    }

}