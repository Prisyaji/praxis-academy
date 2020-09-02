package BelajarInheritance;

public class Segitiga extends BangunDatar{

    float alas;
    float tinggi;

    @Override
    float Luas() {
        float Luas = 1/2 * (alas * tinggi);
        System.out.println ("Luas Segitiga : " + Luas);
        return Luas;
    }
    
}