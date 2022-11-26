package Java.AlgoritmaStrukturData.Karel.Pertemuan8;

public class Mahasiswa {

    String name;
    String NIK;
    String Jurusan;

    public Mahasiswa(String name, String NIK, String Jurusan){
        this.name = name;
        this.NIK = NIK;
        this.Jurusan = Jurusan;
    }

    public Mahasiswa(String name, String Jurusan){
        this.name = name;
        this.Jurusan = Jurusan;
    }

    public void cetakKartu(){
        System.out.println("Nama Anda Adalah : " + this.name);
        System.out.println("NIK Anda Adalah : " + this.NIK);
        System.out.println("Jurusan Anda Adalah : " + this.Jurusan);
    }

    public void cetakinfo(){
        System.out.println("Nama Anda " + this.name + " Jurusan Anda " + this.Jurusan);
    }

    public void sayWelcome(String campusName){
        System.out.println("Hi " + this.name + " Welcome to " + campusName);
    }

}
