// Looping/ pecabangan If/else 
// IF: “Jika kondisi benar maka kerjakan ini, kalau tidak silahkan lanjut”
// IF/ESLE: “Jika kondisi benar maka kerjakan ini, kalau salah maka kerjakan yang itu, setelah itu lanjut” 
import java.util.Scanner;

public class CekLulus {
    public static void main(String[] Args) {
        
        //membuat variabel dan scanner
        int nilai;
        String nama;
        Scanner cek = new Scanner(System.in);

        //mengambil inputan
        System.out.print("Nama : ");
        nama = cek.nextLine();
        System.out.print("Nilai : ");
        nilai = cek.nextInt();

        // cek apakah lulus atau tidak gaes
        if(nilai >= 70){
            System.out.println("Selamat " + nama + ", Anda Lulus");
        } else {
            System.out.println("Maaf Yo " + nama + ", kawus ra lulus");
        }

    }
}