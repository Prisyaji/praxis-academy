package onlineaap;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tulis Umurmu");

        int age = Integer.parseInt(scanner.nextLine());
        if (age == 25){
            System.out.println("Iya Nyong 25");// menampilkan hanya diketikan isian 25
        }
        System.out.println("Terima kasih"); // selalu tampil berapapun isian angkanya
    }
}