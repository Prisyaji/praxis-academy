//package BelajarInheritance;

public class Main {
    public static void main(String[] args) {
        
        //membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        //membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        //membuat objek lingkaran dan mengisi nilai properti
        Lingkaran bulat = new Lingkaran();
        bulat.r = 22;

        //membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang panjang = new PersegiPanjang();
        panjang.panjang = 8;
        panjang.lebar = 4;

        //membuat objek segitiga dan mengisi nilai properti
        Segitiga segi = new Segitiga();
        segi.alas = 12;
        segi.tinggi = 8;

        //memanggil method luas dan keliling
        bangunDatar.Luas();
        bangunDatar.Keliling();

        persegi.Luas();
        persegi.Keliling();

        bulat.Luas();
        bulat.Keliling();

        panjang.Luas();
        panjang.Keliling();

        segi.Luas();
        segi.Keliling();
 
    }
}

// kalau di satu file terdapat beberapa class, public hanya satu yang lain pakai class_nama class

class BangunDatar{
   
    float Luas(){
        System.out.println("Menghitung Luas Bangun Datar");
        return 0;
    }

    float Keliling(){
        System.out.println("Menghitung Keliling Bangun Datar");
        System.out.println();
        return 0;
    }
}

// class Persegi extends BangunDatar {
//     float sisi;   
// }

// class Lingkaran extends BangunDatar {
//     //jari ajri lingkaran
//     float r;
// }

// class PersegiPanjang extends BangunDatar{
//     float panjang;
//     float lebar;
// }

// class Segitiga extends BangunDatar{

//     float alas;
//     float tinggi;

// }

class Persegi extends BangunDatar {
    float sisi;   

    @Override
    float Luas(){
        float Luas = sisi * sisi;
        System.out.println("Luas Persegi : " + Luas);
        return Luas;
    }

    @Override
    float Keliling(){
        float Keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " + Keliling);
        System.out.println();
        return Keliling;    
    }
}

class Lingkaran extends BangunDatar {
    //jari ajri lingkaran
    float r;

    @Override
    float Luas(){
        float Luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran : " + Luas);
        return Luas;
    }

    @Override
    float Keliling(){
        float Keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran " + Keliling);
        System.out.println();
        return Keliling;
    }
}

class PersegiPanjang extends BangunDatar{
    float panjang;
    float lebar;

    @Override
    float Luas(){
        float Luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + Luas);
        return Luas;
    }

    @Override
    float Keliling(){
        float Keliling = 2*panjang * lebar;
        System.out.println("Keliling Persegi Panjang : " + Keliling);
        System.out.println();
        return Keliling;
    }
}

class Segitiga extends BangunDatar{

    float alas;
    float tinggi;

    @Override
    float Luas() {
        float Luas = 1/2 * (alas * tinggi);
        System.out.println ("Luas Segitiga : " + Luas);
        return Luas;
    }
    
    
}