public class BrandMobil{
    String nama_brand, nama_mobil;

    public static void main(String[] args) {
        // Membuat objek
        BrandMobil brand = new BrandMobil();
        System.out.println("=====Brand Mobil=====");
        brand.Brand();

    }
    void Brand(){
        nama_brand = "Toyota";
        nama_mobil = "Kapansah";
        System.out.println("Nama Brand Mobil    : " + nama_brand);
        System.out.println("Nama Mobil          : " + nama_mobil);
    }
}
