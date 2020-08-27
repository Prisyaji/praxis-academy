import java.util.Scanner;

public class DataSiswa {
    public static void main (String[] args) {
        // Deklarasi Variabel
        String namaSiswa, alamat;
        int usia, nilai;

        // membuat scanner baru
        Scanner keyboard = new Scanner (System.in);
        
            // Output ke user untuk input
            System.out.println(" ===== Data Siswa Sekolah Kesatuan bangsa ===== ");
            System.out.print("Nama Siswa : ");
        
        //menggunakan Scanner kemudian menyimpan apa yang diketik di variabel
        namaSiswa = keyboard.nextLine();
        
            //Output lagi
            System.out.print("Alamat : ");

        //menggunakan scanner lagi untuk bisa input di variabel alamat
        alamat = keyboard.nextLine();

            //output lagi
            System.out.print("Usia : ");

        // menggunakan scanner lagi untuk bisa input usia
        usia = keyboard.nextInt();

            // output lagi
            System.out.print("Nilai :" );

        // Menggunakan Scanner lagi untuk bisa input nilai
        nilai = keyboard.nextInt();

        // menampilkan semua variabel yang diinputkan
        System.out.println ("================");
        System.out.println("Nama Siswa  : " + namaSiswa);
        System.out.println("Alamat      : " + alamat);
        System.out.println("Usia        : " + usia + " Tahun");
        System.out.println("Nilai Siswa : " + nilai);

     }
}
