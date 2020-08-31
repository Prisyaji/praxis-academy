// percabangan if else/if memiliki lebih dari dua pilihan
import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
    // membuat variabel dan scanner
    int nilai;
    String grade;
    Scanner nyecan = new Scanner (System.in);

    // mengambil input
    System.out.print("Inputkan Nilai : ");
    nilai = nyecan.nextInt();

    //hitung gradenya
    if ( nilai >= 90 ) {
        grade = "A";
    } else if( nilai >= 80) {
        grade = "B+";
    } else if ( nilai >= 70 ) {
        grade = "C+";
    } else if ( nilai >= 60 ) {
        grade = "C";
    } else if ( nilai >=  50 ) {
        grade = "D";
    } else {
        grade = "E";
    }
        System.out.println("Grade anda adalah : " + grade);
    }
}