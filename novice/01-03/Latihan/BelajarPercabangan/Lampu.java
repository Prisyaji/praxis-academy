// SWitch/ case
//Percabangan SWITCH/CASE sebenarnya adalah bentuk lain dari IF/ELSE/IF.
//Bedanya, percabangan ini menggunakan kata kunci switch dan case
//Perlu diperhatikan juga: di sana ada kata kunci break dan default.
//     break artinya berhenti. 
//     Ini untuk memerintahkan komputer untuk berhenti mengecek case yang lainnya.
//     default artinya jika nilai variabel tidak ada yang sama dengan pilihan case di atas, 
//     maka kerjakan kode yang ada di dalam default.

// Pilihan default bisa juga tidak memiliki break, 
// karena dia adalah pilihan terakhir. Artinya pengecekan akan berakhir di situ.

import java.util.Scanner;

public class Lampu {
    public static void main(String[] Args) {
        //membuat variabel dan scanner
        String lampu;
        Scanner lampuDalan = new Scanner(System.in);

        // membuat inputan
        System.out.print("Inputkan Warnanya Bos : ");
        lampu = lampuDalan.nextLine();
        
        // perulangannya test
        switch(lampu){
            case "Merah":
                System.out.println("Lampu Merah kui Wajib Berhenti !!!");
                break;
            case "Kuning":
                System.out.println("Lampu Kuning Kui Ati Ati Yo le ");
                break;
            case "Hijau":
                System.out.println("Lampune Ijo Mlayuooo");
                break;
            default:
                System.out.println("pilih Lampune salah dab");  
        }
    }
}