package BelajarInheritance;

public class PersegiPanjang extends BangunDatar{
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
