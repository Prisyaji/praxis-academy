public class Pembanding {
    public static void main(String[] args) {
        // deklarasi variabel dan tipe data
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // Apakah A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println("Hasilnya adalah : " + hasil);

        //Apakah A Lebih Kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println("Hasilnya adalah : " + hasil);

        //Apakah A lebih besar samadengan B?
        hasil = nilaiA >= nilaiB;
        System.out.println("Hasilnya adalah : " + hasil);

        //Apakah A lebih kecil samadengan B?
        hasil = nilaiA <= nilaiB;
        System.out.println("Hasilnya adalah : " + hasil);

        //Apakah A samadengan B?
        hasil = nilaiA == nilaiB;
        System.out.println("Hasilnya adalah : " + hasil);

        //Apakah A tidak samadengan B?
        hasil = nilaiA != nilaiB;
        System.out.println("Hasilnya adalah : " + hasil);

    }
    
}