// Percabangan IF
// Percabangan ini hanya memiliki satu pilihan. 
// Artinya, pilihan di dalam IF hanya akan dikerjakan kalau kondisinya benar


import java.util.Scanner; 

public class Hadiah{
    public static void main(String[] args) {
        // membuat variabel belanja dan Scanner
        int belanja = 0;
        Scanner tuku = new Scanner(System.in);

        // mengambil input
        System.out.print("Total Belanjaanya : Rp. ");
        belanja = tuku.nextInt();

        // cek apakah dia belanja diatas 100 rbu
        if (belanja > 100000) {
            System.out.println("Selamat anda dapat hadiah cuy");
        }

        System.out.println("Terimakasih");

    }
}