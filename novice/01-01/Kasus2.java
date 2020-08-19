import java.util.Scanner;

public class Kasus2 {

  public static void main(String[] args) {
    int i, j, m, n;// mendeklarasikan variable i, j, m, n, dimana variable i digunakan untuk perulangan baris, variable j untuk perulangan kolom, variable m untuk jumlah baris matriks, variable n untuk jumlah kolom matriks
    int matriks1[][] = new int[10][10];// mendeklarasikan variable matriks1[10][10], matriks2[10][10], dan hasil[10][10]
    int matriks2[][] = new int[10][10];// yang merupakan array dua dimensi yang memiliki maksimal panjang 
    int hasil[][] = new int[10][10]; // atau ukurun array baris dan kolom sebanyak 10.
    Scanner scan = new Scanner(System.in); // Mendeklarasikan variable scan untuk menginput nilai
    System.out.print("Masukkan jumlah baris matriks: ");
    m = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks: ");
    n = scan.nextInt();
    System.out.println("Masukkan elemen matriks pertama: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks1[i][j] = scan.nextInt();
      }
    }
    System.out.println("Masukkan elemen matriks kedua: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        matriks2[i][j] = scan.nextInt();
      }
    }
    System.out.println("Hasil penjumlahan matriks: ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        hasil[i][j] = matriks1[i][j] + matriks2[i][j];
        System.out.print(hasil[i][j] + "\t");
      }
      System.out.println();
    }
  }
}