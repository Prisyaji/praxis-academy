//class polos tanpa constructor

// class Coba {
//    String dataString;
//    int dataInteger; 
// }

//class dengan constructor
class Siswa{
    String nama;
    String nim;
    String jurusan;



//Constructor dengan parameter

    Siswa(String inputNama, String inputNim, String inputJurusan){
        nama = inputNama;
        nim = inputNim;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(nim);
        System.out.println(jurusan);
    }
}

public class Main{
    public static void main(String[] args) {
        
        //Siswa siswa1 = new Siswa(); // ini udah constructor
        Siswa siswa1 = new Siswa("hjhjh","1212","adad"); // ini udah constructor
        Siswa siswa2 = new Siswa("prince","2134","IPs"); //ini constructor yang sudah disii parameter
        Siswa siswa3 = new Siswa("Kampret","21212","gtgtf");
    }
}