// Belajar OOP (Ini file latihan Object)
// class sebagai template (wadah)
class Siswa {
    String nama;
    int NIP;
    String namaOrtu;
    double nilai;
    int umur;

}


public class Main {
    public static void main(String[] args) {
        // membuat object nya/ instiansiasi
        Siswa siswa1 = new Siswa(); // hasil dari membuat object dengan nama mahasiswa1
        siswa1.nama = "Sayang";
        siswa1.NIP = 82900;
        siswa1.namaOrtu = "agungDM";
        siswa1.nilai = 83.5;
        siswa1.umur = 17;


        System.out.println("Nama Siswa  : " + siswa1.nama);
        System.out.println("NIP         : " + siswa1.NIP);
        System.out.println("Nama OrTu   : " + siswa1.namaOrtu);
        System.out.println("Nilai       : " + siswa1.nilai);
        System.out.println("Umur        : " + siswa1.umur + " Tahun");

    }           
}