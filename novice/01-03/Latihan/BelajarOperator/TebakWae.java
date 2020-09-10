import java.util.Scanner;

public class TebakWae {

    static Scanner input = new Scanner(System.in);
  
    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++");
        System.out.println("Tebakan Yuh Lah");
        System.out.println("++++++++++++++++++++");
        System.out.println("Masukan Angka 1-10");
        
        int nebak = input.nextInt();
        int angka = (int) (10*Math.random()) + 1;
   
        if (nebak == angka) {
            System.out.print("Yo Koe Hebat Menang");
            System.out.println();
        } else{
            System.out.println("Kalahhh Koe lah, coba neh sesuk");
            System.out.println("Tebakan Sing bener kui : " + angka);
        }
        System.out.println("Selesai wae");
    }

}
